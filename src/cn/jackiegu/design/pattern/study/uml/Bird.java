package cn.jackiegu.design.pattern.study.uml;

/**
 * 鸟
 *
 * @author JackieGu
 */
public class Bird extends Animal {

    // 羽毛
    public String feather = "羽毛";

    // 有角质喙没有牙齿
    public String hornyBeakWithoutTeeth = "有角质喙没有牙齿";

    // 翅膀
    private Wing wing;

    public Bird() {
        // 组合关系, 在生成对象时同时生成
        wing = new Wing();
    }

    public Wing getWing() {
        System.out.println(wing);
        return wing;
    }

    /**
     * 下蛋
     */
    public void layEggs() {
        System.out.println("下蛋");
    }
}
