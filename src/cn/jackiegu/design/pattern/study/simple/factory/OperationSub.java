package cn.jackiegu.design.pattern.study.simple.factory;

/**
 * 减法运算类
 *
 * @author JackieGu
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
