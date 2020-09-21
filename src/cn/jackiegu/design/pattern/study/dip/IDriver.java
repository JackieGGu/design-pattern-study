package cn.jackiegu.design.pattern.study.dip;

/**
 * 抽象驾驶员类
 *
 * @author JackieGu
 * @date 2020/9/21
 */
public abstract class IDriver {

    /**
     * 抽象汽车
     */
    protected ICar car;

    /**
     * 驾驶员驾驶汽车
     */
   public abstract void driver();

    /**
     * 更换汽车
     *
     * @param car 汽车对象
     */
    public void changeCar(ICar car) {
        this.car = car;
    }
}
