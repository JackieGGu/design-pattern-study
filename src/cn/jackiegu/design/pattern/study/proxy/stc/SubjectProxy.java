package cn.jackiegu.design.pattern.study.proxy.stc;

/**
 * 代理对象类
 *
 * @author JackieGu
 * @date 2020/9/24
 */
public class SubjectProxy implements Subject {

    private SubjectReal object;

    public SubjectProxy(SubjectReal object) {
        this.object = object;
    }

    @Override
    public void request() {
        this.before();
        object.request();
        this.after();
    }

    /**
     * 代理对象方法扩展
     */
    private void before() {
        System.out.println("before...");
    }

    /**
     * 代理对象方法扩展
     */
    private void after() {
        System.out.println("after...");
    }
}
