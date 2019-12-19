package cn.jackiegu.design.pattern.study.uml;

/**
 * 大雁
 *
 * @author JackieGu
 */
public class WideGoose extends Bird implements Flight {

    @Override
    public void fly() {
        System.out.println("飞");
    }
}
