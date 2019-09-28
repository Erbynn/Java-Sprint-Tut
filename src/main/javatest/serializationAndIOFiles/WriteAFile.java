package serializationAndIOFiles;

/*
* Dabbling with Writing string to a Text File for other programs to use
* Writing text data(usually String) is similar to writing an object(Serializing)
* except you write a String instead of an object.
*
* Usually for some other non-java program to read :)
* */

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        try{
//            no connection & chain stream....just straight-forward
            FileWriter writer = new FileWriter("demystify.txt");
            writer.write("hello Demystify\n");
            writer.write("hello PK Erbynn\n");
            writer.write("hello John Erbynn");
            writer.close();

            System.out.println("Done!");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
