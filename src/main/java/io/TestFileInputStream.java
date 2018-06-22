package io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) {

        int b = 0;
        FileInputStream in = null;

        try {
            in = new FileInputStream("C:\\Users\\Matthew\\Documents\\test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            //系统退出
            System.exit(-1);
        }

        try {
            int num = 0;
            while ((b = in.read()) != -1) {
                System.out.print((char) b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("共读取了 " + num + " 个字节");
        } catch (IOException e) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }

    }
}
