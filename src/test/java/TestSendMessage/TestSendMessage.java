import org.apache.tomcat.jni.Socket;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import tiy.webapp.WebChatClient;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.AssertTrue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        String testClientMessage = "testClientMessage";
        String testServerMessage;

        WebChatClient  myWebChatClient= new WebChatClient();

        String serverResponse = myWebChatClient.SendMessage(testClientMessage);

        assertEquals("what I expect back from the server", serverResponse);

//
//        assertTrue(testClientMessage.equals(testServerMessage));



    }
}
