package cn.jackiegu.design.pattern.study.dip;

/**
 * 自行车
 *
 * @author JackieGu
 * @date 2020/9/21
 */
public class Bike implements ICar {

    @Override
    public void run() {
        System.out.println("自行车开始运行");
    }
}
