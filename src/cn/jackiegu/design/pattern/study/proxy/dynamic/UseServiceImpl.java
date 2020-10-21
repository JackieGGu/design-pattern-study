package cn.jackiegu.design.pattern.study.proxy.dynamic;

/**
 * 动态代理实现类
 *
 * @author JackieGu
 * @date 2020/10/11
 */
public class UseServiceImpl implements UserService {

    @Override
    public Integer execute(int result) {
        System.out.println("executing...");
        return result;
    }
}
