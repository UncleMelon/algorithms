package container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

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

        //iterator的使用
        HashSet<Name> names = new HashSet<>();
        names.add(new Name("f1", "l1"));
        names.add(new Name("f2", "l2"));
        names.add(new Name("f3", "l3"));
        Iterator<Name> iterator = names.iterator();
        while (iterator.hasNext()) {
            Name name = iterator.next();
            System.out.print(name.getFirstName() + " ");
        }

        HashSet<Name> names1 = new HashSet<>();
        names1.add(new Name("fff1", "lll1"));
        names1.add(new Name("f2", "l2"));
        names1.add(new Name("fff3", "lll2"));
        Iterator<Name> iterator1 = names1.iterator();
        while (iterator1.hasNext()) {
            Name name = iterator1.next();
            if (name.getFirstName().length() < 3) {
                iterator1.remove();
            }
        }
        System.out.println(names1);
    }
}
