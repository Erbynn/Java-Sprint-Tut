package filehandler;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingFromTextFile {
    public static void main(String[] args) {
        FileInputStream myFile = null;
        BufferedInputStream buff = null;

        try {
            myFile = new FileInputStream("scores.txt");
            buff = new BufferedInputStream(myFile);

            while (true){
                buff.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
