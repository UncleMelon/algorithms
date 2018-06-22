package io;

import java.io.*;

public class TestObjectIO {
    public static void main(String[] args) {
        T t = new T();
        t.k = 8;
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Matthew\\Documents\\testobjectio.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("C:\\Users\\Matthew\\Documents\\testobjectio.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            T tReaded = (T) ois.readObject();
            System.out.println(tReaded.i + " " + tReaded.j + " " + tReaded.d + " " + tReaded.k);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

//Serializable, 标记性接口，向编译器表明这个类的对象是可以被序列化的
class T implements Serializable {
    int i = 10;
    int j = 9;
    double d = 2.3;
    transient int k = 15;
}
