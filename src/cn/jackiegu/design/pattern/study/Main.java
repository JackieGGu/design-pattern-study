package cn.jackiegu.design.pattern.study;

import cn.jackiegu.design.pattern.study.decorator.Human;
import cn.jackiegu.design.pattern.study.decorator.IronManDecorator;
import cn.jackiegu.design.pattern.study.decorator.Man;
import cn.jackiegu.design.pattern.study.decorator.SuperManDecorator;
import cn.jackiegu.design.pattern.study.dip.Benz;
import cn.jackiegu.design.pattern.study.dip.Bike;
import cn.jackiegu.design.pattern.study.dip.Bmw;
import cn.jackiegu.design.pattern.study.dip.Driver;
import cn.jackiegu.design.pattern.study.dip.IDriver;
import cn.jackiegu.design.pattern.study.proxy.dynamic.MyInvocationHandler;
import cn.jackiegu.design.pattern.study.proxy.dynamic.UseServiceImpl;
import cn.jackiegu.design.pattern.study.proxy.dynamic.UserService;
import cn.jackiegu.design.pattern.study.proxy.stc.SubjectProxy;
import cn.jackiegu.design.pattern.study.proxy.stc.SubjectReal;
import cn.jackiegu.design.pattern.study.simple.factory.Operation;
import cn.jackiegu.design.pattern.study.simple.factory.OperationFactory;
import cn.jackiegu.design.pattern.study.strategy.CashStrategy;
import cn.jackiegu.design.pattern.study.uml.Climate;
import cn.jackiegu.design.pattern.study.uml.DonaldDuck;
import cn.jackiegu.design.pattern.study.uml.Oxygen;
import cn.jackiegu.design.pattern.study.uml.Penguin;
import cn.jackiegu.design.pattern.study.uml.Water;

import java.lang.reflect.Proxy;
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
        // strategyTest();
        // DipTest();
        // decoratorTest();
        // staticProxyTest();
        dynamicProxyTest();
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

    /**
     * 依赖倒置原则测试
     */
    public static void DipTest() {
        IDriver tom = new Driver(new Benz());
        logger("tom: ");
        tom.driver();
        tom.changeCar(new Bike());
        tom.driver();
        IDriver jerry = new Driver(new Bmw());
        logger("jerry: ");
        jerry.driver();
    }

    /**
     * 装饰模式测试
     */
    public static void decoratorTest() {
        Human human = new Man();
        Human superMan = new SuperManDecorator(human);
        logger("超人: ");
        superMan.run();

        Human ironMan = new IronManDecorator(superMan);
        logger("钢铁侠: ");
        ironMan.run();
    }

    /**
     * 静态代理测试
     */
    public static void staticProxyTest() {
        SubjectReal object = new SubjectReal();
        SubjectProxy proxyObject = new SubjectProxy(object);
        proxyObject.request();
    }

    /**
     * 动态代理测试
     */
    public static void dynamicProxyTest() {
        ClassLoader classLoader = Main.class.getClassLoader();
        Class<?>[] interfaces = {UserService.class};
        MyInvocationHandler invocationHandler = new MyInvocationHandler(new UseServiceImpl());
        UserService userService = (UserService)Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        Integer result = userService.execute(8);
        logger("返回结果: " + result);
    }

    private static void logger(String str) {
        System.out.println("\033[94m" + str + "\033[0m");
    }
}
