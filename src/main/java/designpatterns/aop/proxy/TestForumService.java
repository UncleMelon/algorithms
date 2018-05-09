package designpatterns.aop.proxy;

/**
 * Created by Administrator on 2018/1/29.
 */
public class TestForumService {
    public static void main(String[] args) {
        ForumService forumService = new ForumServiceImpl();
        forumService.removeForum(10);
        forumService.removeTopic(1012);
    }
}
