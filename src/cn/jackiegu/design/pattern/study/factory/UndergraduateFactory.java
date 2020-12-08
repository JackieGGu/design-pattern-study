package cn.jackiegu.design.pattern.study.factory;

/**
 * 大学生雷锋工厂类
 *
 * @author JackieGu
 */
public class UndergraduateFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
