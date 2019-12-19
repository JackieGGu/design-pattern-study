package cn.jackiegu.design.pattern.study.uml;

/**
 * 唐老鸭
 *
 * @author JackieGu
 */
public class DonaldDuck extends Duck implements Language {

    @Override
    public void speak() {
        System.out.println("讲人话");
    }
}
