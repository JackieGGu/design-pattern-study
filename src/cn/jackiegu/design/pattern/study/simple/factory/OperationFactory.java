package cn.jackiegu.design.pattern.study.simple.factory;

/**
 * 算法简单工厂类
 *
 * @author JackieGu
 */
public class OperationFactory {

    public static Operation getOperation(String operation) {
        switch (operation) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
            default:
                throw new RuntimeException("不支持的算法类型");
        }
    }
}
