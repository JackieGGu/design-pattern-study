package cn.jackiegu.design.pattern.study.factory;

/**
 * 自愿者雷锋工厂类
 *
 * @author JackieGu
 */
public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
