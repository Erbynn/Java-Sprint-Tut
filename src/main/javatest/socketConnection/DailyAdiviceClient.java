package socketConnection;

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

//            read
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
