package cn.jackiegu.design.pattern.study.uml;

/**
 * 企鹅
 *
 * @author JackieGu
 */
public class Penguin extends Bird {

    private Climate climate;

    public Climate getClimate() {
        return this.climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }
}
