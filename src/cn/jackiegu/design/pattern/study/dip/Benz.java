package cn.jackiegu.design.pattern.study.dip;

/**
 * 奔驰汽车
 *
 * @author JackieGu
 * @date 2020/9/21
 */
public class Benz implements ICar {

    @Override
    public void run() {
        System.out.println("奔驰汽车开始运行");
    }
}
