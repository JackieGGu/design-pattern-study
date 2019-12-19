package cn.jackiegu.design.pattern.study.uml;

/**
 * 大雁群
 *
 * @author JackieGu
 */
public class WideGooseAggregate {

    private WideGoose[] wideGooseArray;

    /**
     * V形飞翔
     */
    public void vFly() {
        System.out.println("V形飞翔");
    }

    /**
     * 一形飞翔
     */
    public void oneFly() {
        System.out.println("一形飞翔");
    }
}
