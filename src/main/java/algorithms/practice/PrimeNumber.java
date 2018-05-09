package algorithms.practice;

/**
 * Created by Administrator on 2017/12/1.
 * 打印1000以下所有的素数(除了1和它本身以外,不能被任何整数整除的数)
 */
public class PrimeNumber {
    public static void printPrimeNumber() {
        boolean flag;
        for(int i=2; i<1000; i++) {
            flag = false;
            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printPrimeNumber();
    }
}
