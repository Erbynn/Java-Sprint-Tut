package filehandler;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* Reading big chunk of bytes from a file in one shot and quickly with help of buffer stream
* 1. File to be read as input stream from destination to the program
* 2. Read all data until returns -ves with while loop
* 3. Close appropriately
* */

public class BufferStreamReader {
    public static void main(String[] args) {
        FileInputStream myFile = null;
        BufferedInputStream myFileBuf = null;

        try {
            myFile = new FileInputStream("C:\\Users\\Mr. Erbynn\\Desktop\\pk.txt");
            myFileBuf = new BufferedInputStream(myFile);

            while (true){
                int byteValue = myFileBuf.read();
                System.out.println(byteValue);

                if(byteValue == -1) break;
            }
        } catch (Exception e) {
            System.out.println("file not exit " + e.toString());
        } finally {
            try {
                myFileBuf.close();
                myFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
