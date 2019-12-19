package cn.jackiegu.design.pattern.study.simple.factory;

/**
 * 加法运算类
 *
 * @author JackieGu
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
