package cn.jackiegu.design.pattern.study.decorator;

/**
 * 超人装饰实现类
 *
 * @author JackieGu
 * @date 2020/9/23
 */
public class SuperManDecorator extends AbstractDecorator {

    public SuperManDecorator(Human human) {
        // 调用装饰类的构造方法
        super(human);
    }

    @Override
    public void run() {
        super.run();
        this.fly();
    }

    /**
     * 装饰实现类增加的功能
     */
    private void fly() {
        System.out.println("飞");
    }
}
