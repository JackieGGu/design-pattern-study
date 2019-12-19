package cn.jackiegu.design.pattern.study;

import cn.jackiegu.design.pattern.study.simple.factory.Operation;
import cn.jackiegu.design.pattern.study.simple.factory.OperationFactory;

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
        simpleFactoryTest();
    }

    /**
     * 简单工厂类测试
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
}
