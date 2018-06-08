package container;

import java.util.*;

public class BasciGeneric {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            System.out.println(s);
        }


        Collection<String> c = new HashSet<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        for (Iterator<String> it = c.iterator(); it.hasNext();) {
            String s = it.next();
            System.out.println(s);
        }

    }
}

class MyName implements Comparable<MyName> {
    private int age;

    @Override
    public int compareTo(MyName o) {
        if (this.age > o.age) return 1;
        if (this.age < o.age) return -1;
        else return 0;
    }
}