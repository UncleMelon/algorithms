package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTransform2 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);  //阻塞(同步式的)
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        try {
            s = br.readLine();
            while (s != null) {
                if (s.equalsIgnoreCase("exit")) break;
                System.out.println(s);
                s = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
