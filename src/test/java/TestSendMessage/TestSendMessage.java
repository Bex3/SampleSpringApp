import org.apache.tomcat.jni.Socket;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import tiy.webapp.WebChatClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by bearden-tellez on 9/16/16.
 */
public class TestSendMessage {

    @BeforeClass
    public static void setUp() throws Exception {



    }

    @AfterClass
    public static void tearDown() throws Exception {

    }

    @Test
    public void testSingleMessageToServer() throws IOException {
        WebChatClient  myWebChatClient= new WebChatClient();


//        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

    }
}
