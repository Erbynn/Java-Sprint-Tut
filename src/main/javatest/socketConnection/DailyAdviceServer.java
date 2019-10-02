package socketConnection;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Writing a Server
 * It takes TWO Sockets...ServerSocket & Plain old Socket
 * How?
 * 1. Server app makes a ServerSocket on Specific port
 * 2. Client makes Socket connection to the Server app
 * 3. Server makes new Socket to communicate with Client
 *
 * This program makes a ServerSocket and waits for client requests
 * */

public class DailyAdviceServer {

    String[] adviceList = {
            "Take smallest bites",
            "Go fat the tight jeans",
            "When the going gets tough, the tough gets going",
            "Success is the sum of small daily efforts"
    };

    public void go() {

        try {
//            ServerSocket makes this server app 'listen' for clients requests on port 4242 on matchine this code is running on
            ServerSocket serverSocket = new ServerSocket(4242);

//            Server goes into permanent loop waiting for client requests
            while (true) {

//                the accept() blocks until request comes in, and then the method returns a Socket for communicating
                Socket sock = serverSocket.accept();

//                use the Socket connection to the client and to make PrintWriter send a message to the client
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);

                writer.close();
                System.out.println(advice);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }


}
