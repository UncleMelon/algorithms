package designpatterns.aop.proxy_jdk;


import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/1/29.
 */
public class ForumServiceTest {
    public static void main(String[] args) {
        ForumService target = new ForumServiceImpl();

        PerformanceHandler handler = new PerformanceHandler(target);

        ForumService proxy = (ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);

        proxy.removeForum(10);
        proxy.removeTopic(1012);
    }
}
