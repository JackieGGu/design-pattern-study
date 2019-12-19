package cn.jackiegu.design.pattern.study.uml;

/**
 * 企鹅
 *
 * @author JackieGu
 */
public class Penguin extends Bird {

    // 气候
    private Climate climate;

    public Climate getClimate() {
        System.out.println(climate);
        return climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }
}
