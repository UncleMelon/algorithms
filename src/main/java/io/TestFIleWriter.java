package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFIleWriter {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("C:\\Users\\Matthew\\Documents\\unicode.dat");
            for (int c = 0; c < 50000; c++) {
                fw.write(c);
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件写入错误");
            System.exit(-1);
        }
    }
}
