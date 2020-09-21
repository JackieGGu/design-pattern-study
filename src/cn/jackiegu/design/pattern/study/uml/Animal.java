package cn.jackiegu.design.pattern.study.uml;

/**
 * 动物抽象类
 *
 * @author JackieGu
 */
public abstract class Animal {

    public String life = "生命";

    /**
     * 新陈代谢
     *
     * @param oxygen 氧气
     * @param water  水
     */
    public void metabolism(Oxygen oxygen, Water water) {
        System.out.println(oxygen + " + " + water + " = " + "新城代谢");
    }

    /**
     * 繁殖
     */
    public void reproduce() {
        System.out.println("繁殖");
    }
}
