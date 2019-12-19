package cn.jackiegu.design.pattern.study.simple.factory;

/**
 * 运算方法抽象类
 *
 * @author JackieGu
 */
public abstract class Operation {

    private double numberA;

    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    /**
     * 获取计算结果
     *
     * @return 计算结果
     */
    public abstract double getResult();
}
