package cn.jackiegu.design.pattern.study.proxy.stc;

/**
 * 实际对象类
 *
 * @author JackieGu
 * @date 2020/9/24
 */
public class SubjectReal implements Subject {

    @Override
    public void request() {
        System.out.println("do something...");
    }
}
