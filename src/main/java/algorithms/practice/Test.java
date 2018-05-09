package algorithms.practice;

/**
 * Created by Administrator on 2017/12/4.
 */
public class Test {

    public static void main(String[] args) {
        int n=3;
        int m=3;

        System.out.println(n==m);

        String str = new String("hello");
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1==str2);

        str1 = str;
        str2 = str;
        System.out.println(str1==str2);
    }
}
