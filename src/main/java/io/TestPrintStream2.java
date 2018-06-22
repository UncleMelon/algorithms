package io;

import java.io.*;

public class TestPrintStream2 {
    public static void main(String[] args) {
        String filename = args[0];
        if (filename != null) {
            list(filename, System.out);
        }
    }

    public static void list(String f, PrintStream fs) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = null;
            while ((s = br.readLine()) != null) {
                fs.println(s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("无法读取文件");
        }
    }
}
