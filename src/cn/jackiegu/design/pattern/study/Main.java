package cn.jackiegu.design.pattern.study;

import cn.jackiegu.design.pattern.study.simple.factory.Operation;
import cn.jackiegu.design.pattern.study.simple.factory.OperationFactory;
import cn.jackiegu.design.pattern.study.strategy.CashStrategy;
import cn.jackiegu.design.pattern.study.uml.Climate;
import cn.jackiegu.design.pattern.study.uml.DonaldDuck;
import cn.jackiegu.design.pattern.study.uml.Oxygen;
import cn.jackiegu.design.pattern.study.uml.Penguin;
import cn.jackiegu.design.pattern.study.uml.Water;

import java.util.HashMap;
import java.util.Map;

/**
 * 主测试类
 *
 * @author JackieGu
 */
public class Main {

    /**
     * 主测试函数
     */
    public static void main(String[] args) {
        // simpleFactoryTest();
        // umlTest();
        strategyTest();
    }

    /**
     * 简单工厂模式测试
     */
    public static void simpleFactoryTest() {
        Operation operationAdd = OperationFactory.getOperation("+");
        operationAdd.setNumberA(1);
        operationAdd.setNumberB(2);
        System.out.println(operationAdd.getResult());

        Operation operationDiv = OperationFactory.getOperation("/");
        operationDiv.setNumberA(1);
        operationDiv.setNumberB(0);
        System.out.println(operationDiv.getResult());
    }

    /**
     * UML图测试
     */
    public static void umlTest() {
        DonaldDuck donaldDuck = new DonaldDuck();
        logger("唐老鸭: ");
        System.out.println(donaldDuck.life);
        System.out.println(donaldDuck.feather);
        System.out.println(donaldDuck.hornyBeakWithoutTeeth);
        System.out.println(donaldDuck.getWing());
        donaldDuck.metabolism(new Oxygen(), new Water());
        donaldDuck.reproduce();
        donaldDuck.layEggs();
        donaldDuck.speak();

        Penguin penguin = new Penguin();
        penguin.setClimate(new Climate());
        logger("企鹅: ");
        System.out.println(penguin.life);
        System.out.println(penguin.feather);
        System.out.println(penguin.hornyBeakWithoutTeeth);
        System.out.println(donaldDuck.getWing());
        System.out.println(penguin.getClimate());
        penguin.metabolism(new Oxygen(), new Water());
        penguin.reproduce();
        penguin.layEggs();
    }

    /**
     * 策略模式测试
     */
    public static void strategyTest() {
        logger("正常收费: ");
        CashStrategy cashNormal = new CashStrategy(CashStrategy.NORMAL, null);
        System.out.println(cashNormal.getActualMoney(100));

        logger("打折收费: ");
        Map<String, Double> rebateMap = new HashMap<>();
        rebateMap.put(CashStrategy.REBATE_KEY, 0.98);
        CashStrategy cashRebate = new CashStrategy(CashStrategy.REBATE, rebateMap);
        System.out.println(cashRebate.getActualMoney(100));

        logger("返利收费: ");
        Map<String, Double> returnMap = new HashMap<>();
        returnMap.put(CashStrategy.RETURN_CONDITION_KEY, 30.0);
        returnMap.put(CashStrategy.RETURN_VAL_KEY, 10.0);
        CashStrategy cashReturn = new CashStrategy(CashStrategy.RETURN, returnMap);
        System.out.println(cashReturn.getActualMoney(100));
    }

    private static void logger(String str) {
        System.out.println("\033[94m" + str + "\033[0m");
    }
}
