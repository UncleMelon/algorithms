package basic;

/**
 * Created by Administrator on 2018/5/21.
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //对象引用的复制
        Person p = new Person("zhang", 23);
        Person p1 = p;
        System.out.println(p);
        System.out.println(p1);


        //软拷贝
        Person p10 = new Person("zhang", 23);
        Person p11 = p10.clone();
        System.out.println(p10);
        System.out.println(p11);
        System.out.println(p10.getName());
        System.out.println(p11.getName());
        String result = p.getName() == p1.getName() ? "clone是浅拷贝的" : "clone是深拷贝的";
        System.out.println(result);


        // 深拷贝
        Body body = new Body(new Head());
        Body body1 = (Body) body.clone();
        System.out.println("body == body1 : " + (body == body1));
        System.out.println("body.head = body1.head : " + (body.head == body1.head));
        System.out.println("body.head = body1.head : " + (body.head == body1.head));

        String s1 = "wu";
        String s2 = new String("wu");
        String s3 = new String("wu").intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
    }
}
