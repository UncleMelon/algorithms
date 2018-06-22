package concurrent.thread;


/**
 * main方法执行路劲就一条
 */
public class T {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        m2();
        m3();
    }

    private static void m3() {
    }

    private static void m2() {
    }
}
