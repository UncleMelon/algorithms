package algorithms.recursion;

/**
 * Created by Administrator on 2017/9/1.
 */
public class TriangleApp {

    // loop method
    public static int triangle_loop(int n) {
        int total = 0;
        while (n > 0) {     // until n is 1
            total = total + n;  // add n (column height) to total
            --n;                // decrement column height
        }
        return total;
    }

    public static int triangle(int n) {
        if(n == 1)
            return 1;
        else
            return (n + triangle(n-1));
    }

    public static int triangle_test(int n) {
        System.out.println("Entering: n=" + n);
        if(n == 1) {
            System.out.println("Returning 1");
            return 1;
        }
        else {
            int temp = n + triangle_test(n-1);
            System.out.println("Returning " + temp);
            return temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(triangle_test(5));
    }
}
