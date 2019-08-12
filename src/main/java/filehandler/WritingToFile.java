package filehandler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    public static void main(String[] args) {

        String[] playerScores = { "John 30pt", "Abena 45pt", "Kweku 55pt", "Row 32pt"};

        FileWriter myFile = null;
        BufferedWriter bufWritter = null;

        try{
            myFile = new FileWriter("Score.txt");
            bufWritter = new BufferedWriter(myFile);

            for (String playerScore : playerScores) {
                System.out.println("Writing " + playerScore + "...");
                bufWritter.write(playerScore);
            }

            System.out.println("Done writing to file.");
         }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                bufWritter.flush();
                bufWritter.close();
                myFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
