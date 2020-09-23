package cn.jackiegu.design.pattern.study.decorator;

/**
 * 钢铁侠装饰实现类
 *
 * @author JackieGu
 * @date 2020/9/23
 */
public class IronManDecorator extends AbstractDecorator {

    public IronManDecorator(Human human) {
        super(human);
    }

    @Override
    public void run() {
        super.run();
        this.beam();
    }

    /**
     * 装饰实现类增加的功能
     */
    private void beam() {
        System.out.println("发射光束");
    }
}
