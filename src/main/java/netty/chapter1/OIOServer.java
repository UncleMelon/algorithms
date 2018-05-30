package netty.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2018/5/10.
 */
public class OIOServer {

    public static void main(String[] args) {
        int portNumber = 12345;
        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);
            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out =  new PrintWriter(clientSocket.getOutputStream(), true);
            String request, response;
            while ((request = in.readLine()) != null) {
                if ("Done".equals(request)) {
                    break;
                }
                response = processRequest(request);
                out.println(response);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String processRequest(String request) {
        return "Processed";
    }
}
