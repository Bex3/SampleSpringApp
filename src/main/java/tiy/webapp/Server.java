package tiy.webapp;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by bearden-tellez on 9/16/16.
 */
public class Server {

    public class SampleServer {
/*Socket theSocket = null;

    public SampleServer(){}
    public SampleServer(Socket inBriceWeTrust){
        this.theSocket = inBriceWeTrust;
    }*/


        public void StartServer() {
            System.out.println("Booting server");
            try {
                ServerSocket serverListener = new ServerSocket(8024); //8005?
                System.out.println("Ready to listen");

                while (true) {
                    Socket incomingConnection = serverListener.accept();
                    ConnectionHandler handler = new ConnectionHandler(incomingConnection);
                    Thread runningThreadServer = new Thread(handler);
                    runningThreadServer.start();
                }
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
        }
    }