package container;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add(new Name("f1", "l2"));
        set.add(new Integer(100));
        set.add(new Name("f1", "l2"));
        set.add("hello");
        System.out.println(set);


        HashSet s1 = new HashSet();
        HashSet s2 = new HashSet();
        s1.add("a"); s1.add("b"); s1.add("c");
        s2.add("a"); s2.add("b"); s2.add("d");
        // Set和List容器类都有Constructor(Collection)方法
        // 构造方法用于初始化容器类
        HashSet sn = new HashSet(s1);
        sn.retainAll(s2);
        HashSet su = new HashSet(s1);
        su.addAll(s2);
        System.out.println(sn);
        System.out.println(su);
    }

}
