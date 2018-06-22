package concurrent.thread;

public class TestYield {
    public static void main(String[] args) {
        MyThraed3 t1 = new MyThraed3("t1");
        MyThraed3 t2 = new MyThraed3("t2");
        t1.start();
        t2.start();
    }
}


class MyThraed3 extends Thread{
    public MyThraed3(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
            if (i % 10 == 0) yield();
        }
    }
}