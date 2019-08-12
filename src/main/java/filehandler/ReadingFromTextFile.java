package filehandler;

import java.io.*;

public class ReadingFromTextFile {
    public static void main(String[] args) {
        FileReader myFile = null;
        BufferedReader buffReader = null;

        try {
            myFile = new FileReader("scores.txt");
            buffReader = new BufferedReader(myFile);

            while (true){
                String line = buffReader.readLine();

                if (line == null) break;

                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buffReader.close();
                myFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
