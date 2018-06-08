package container;

import java.util.Collections;
import java.util.LinkedList;

public class ComparableDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Name("Karl", "M"));
        list.add(new Name("Steven", "Lee"));
        list.add(new Name("John", "O"));
        list.add(new Name("Tom", "M"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
