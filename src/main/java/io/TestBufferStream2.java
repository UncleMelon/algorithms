package io;

import java.io.*;

public class TestBufferStream2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Matthew\\Documents\\dat2.txt"));
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Matthew\\Documents\\testchar.txt"));
            String s = null;
            for (int i = 0; i < 100; i++) {
                s = String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
