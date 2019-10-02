package socketConnection;
/*
* Writing a Client that is ...
* Reading from a Socket
* This is a Client program that makes a Socket connection and reads a single line from the server application
* Simply Connect to server and Read
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DailyAdiviceClient {

    public void go() {

        try {
//            make socket connection
            Socket s = new Socket("127.0.0.1", 4242);

//            chain BufferedReader to InputStreamReader to the input stream from the socket
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

//            read from socket
            String advice = reader.readLine();
            System.out.println("Today your should: " + advice);

//            closes all streams
            reader.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdiviceClient client = new DailyAdiviceClient();
        client.go();
    }
}
