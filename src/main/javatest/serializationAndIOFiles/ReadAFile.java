package serializationAndIOFiles;

/*
* Reading from a text file.
* Pretty much simple with these steps;
*
* 1. use File object to represent the file
* 2. FileReader to do the actual reading and
* 3. BufferedReader to make the reading more efficient
*
* NB: Reading happens in a while loop and ends when ReadLine() returns null
* The most common style to reading data or anything that's NOT a serialized object
* */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

    public static void main(String[] args) {

        try {
//          Represent the File object
            File myfile = new File("demystify.txt");

//          Actual reading of contents...it is a connection stream for characters, that connects to the text file
            FileReader fileReader = new FileReader(myfile);

//          Efficient in reading...a chain stream which is chained on to the fileReader for efficient reading.
//          Goes back to the file on disk to read only when the buffer is empty
            BufferedReader buffReader = new BufferedReader(fileReader);


//           Make a String variable to hold each line that is read
            String line = null;

//          While there are still lines to read, read and assign each to a string variable "line" and print them
            while ((line = buffReader.readLine()) != null) {
                System.out.println(line);
            }
            buffReader.close();


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
