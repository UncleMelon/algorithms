package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTransform1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Matthew\\Documents\\out.txt"));
            osw.write("microsoftibmsumapplehp");
            //查看osw的字符编码
            System.out.println(osw.getEncoding());
            osw.close();
            osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Matthew\\Documents\\out.txt", true), "ISO8859_1");  //latin-1
            osw.write("microsoftibmsumapplehp");
            System.out.println(osw.getEncoding());
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
