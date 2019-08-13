package arrayEncapsulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

public class ScoreWriter {
    /**
    The method main performs the following actions:
     1. Creates an instance of array
     2. Creates score object and populate array with them
     3. Write the scores data into file
     */

    public static void main(String[] args) {
        FileWriter myFile = null;
        BufferedWriter bWriter = null;

        Date today = new Date();
        Score[] scores = new Score[3];

//        player number 1
        scores[0] = new Score();
        scores[0].setFirstName("John");
        scores[0].setLastName("Erbynn");
        scores[0].setScore(200);
        scores[0].setPlayDate(today);

//        player number 2
        scores[1] = new Score();
        scores[1].setFirstName("Raphael");
        scores[1].setLastName("Erbynn");
        scores[1].setScore(250);
        scores[1].setPlayDate(today);

        
    }
}
