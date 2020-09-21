package cn.jackiegu.design.pattern.study.simple.factory;

/**
 * 除法运算类
 *
 * @author JackieGu
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        double numberA = super.getNumberA();
        double numberB = super.getNumberB();
        if (numberB == 0) {
            throw new RuntimeException("除数B不能为0");
        }
        return numberA / numberB;
    }
}
