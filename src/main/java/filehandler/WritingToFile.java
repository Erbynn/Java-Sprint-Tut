package filehandler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    public static void main(String[] args) {

        String[] playerScores = { "John 30pt", "Abena 45pt", "Kweku 55pt", "Rowald 32pt", "Todo 4pt"};

        FileWriter myFile = null;
        BufferedWriter bufWritter = null;

        try{
            myFile = new FileWriter("Score.txt", true);
            bufWritter = new BufferedWriter(myFile);

//            for each loop
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
