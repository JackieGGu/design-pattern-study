package cn.jackiegu.design.pattern.study;

import cn.jackiegu.design.pattern.study.simple.factory.Operation;
import cn.jackiegu.design.pattern.study.simple.factory.OperationFactory;
import cn.jackiegu.design.pattern.study.uml.Climate;
import cn.jackiegu.design.pattern.study.uml.DonaldDuck;
import cn.jackiegu.design.pattern.study.uml.Oxygen;
import cn.jackiegu.design.pattern.study.uml.Penguin;
import cn.jackiegu.design.pattern.study.uml.Water;

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
        umlTest();
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
        System.out.println("\033[94m唐老鸭: \033[0m");
        System.out.println(donaldDuck.life);
        System.out.println(donaldDuck.feather);
        System.out.println(donaldDuck.hornyBeakWithoutTeeth);
        donaldDuck.metabolism(new Oxygen(), new Water());
        donaldDuck.reproduce();
        donaldDuck.getWing();
        donaldDuck.layEggs();
        donaldDuck.speak();

        System.out.println("===============================");

        Penguin penguin = new Penguin();
        System.out.println("\033[94m企鹅: \033[0m");
        System.out.println(penguin.life);
        System.out.println(penguin.feather);
        System.out.println(penguin.hornyBeakWithoutTeeth);
        penguin.metabolism(new Oxygen(), new Water());
        penguin.reproduce();
        penguin.getWing();
        penguin.layEggs();
        penguin.setClimate(new Climate());
        penguin.getClimate();
    }

    /**
     * 策略模式测试
     */
    public static void strategyTest() {

    }
}
