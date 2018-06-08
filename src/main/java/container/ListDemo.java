package container;


import java.util.Collections;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        for (int i = 0; i < 5; i++) {
            l1.add("a" + i);
        }
        System.out.println(l1);
        l1.add(3, "a100");
        System.out.println(l1);
        l1.add(6, "a200");
        System.out.println(l1);
        System.out.print(l1.get(2) + " ");
        System.out.println(l1.indexOf("a3"));
        l1.remove(1);
        System.out.println(l1);

        LinkedList l2 = new LinkedList();
        for (int i = 0; i <= 9 ; i++) {
            l2.add("a" + i);
        }
        System.out.println(l2);
        Collections.shuffle(l2);  //随机排列
        System.out.println(l2);
        Collections.reverse(l2);  //逆序
        System.out.println(l2);
        Collections.sort(l2);   //排序
        System.out.println(l2);
        System.out.println(Collections.binarySearch(l2, "a5"));    // 二分查找
        // int binarySearch(List<? extends Comparable<? super T>> list, T key) 涉及到泛型
        System.out.println("a1".compareTo("a2"));

    }
}
