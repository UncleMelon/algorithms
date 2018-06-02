package container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Matthew on 5/15/2018.
 */
public class BasicContainer {
    public static void main(String[] args) {
        // 使用父类引用指向子类对象，这时候不去访问子类所特有的成员变量
        Collection c = new ArrayList<Object>();
        c.add("hello");
        c.add(new Name("f1", "l1"));
        c.add(new Integer(100));
        System.out.println(c.size());
        System.out.println(c);


        Collection c1 = new HashSet();
        c1.add("hello");
        c1.add(new Name("f1", "l1"));
        c1.add(new Integer(100));
        c1.remove("hello");
        c1.remove(new Integer(100));
        System.out.println(c1.remove(new Name("f1", "l1")));
        System.out.println(c1);

    }
}
