package cn.jackiegu.design.pattern.study.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author JackieGu
 * @date 2020/10/11
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object result = method.invoke(object, args);
        this.after();
        return result;
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
