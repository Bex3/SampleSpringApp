package tiy.webapp;


import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by bearden-tellez on 9/12/16.
 */
public class WebChatClient {

    String serverResponse;

    public String SendMessage(String message) {
        try {
            Socket clientSocket = new java.net.Socket("localhost", 8080);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            System.out.println("output stream initialized");
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("input stream initialized");

            System.out.println(message);

            out.println(message);

//            System.out.println("Can we make it here?");

            serverResponse = in.readLine();


        } catch (Exception exception){
            exception.printStackTrace();
        }

        return serverResponse;
    }

}
