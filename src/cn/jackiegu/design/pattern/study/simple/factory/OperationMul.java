package cn.jackiegu.design.pattern.study.simple.factory;

/**
 * 乘法运算类
 *
 * @author JackieGU
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return super.getNumberA() * super.getNumberB();
    }
}
