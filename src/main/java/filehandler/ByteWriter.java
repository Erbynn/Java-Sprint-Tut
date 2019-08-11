package filehandler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriter {

    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4,5};
        FileOutputStream myFile = null;

        try {
            myFile = new FileOutputStream("test.txt");

            for (int i = 0; i < someNumbers.length; i++){
                myFile.write(someNumbers[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("myfileNotfound: " + e.getMessage());
        } catch (IOException e){
            e.getMessage();
        }
        finally {
            try {
                myFile.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Done writing to file");
        }
    }



}
