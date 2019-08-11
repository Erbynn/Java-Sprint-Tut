package filehandler;

/*
 * Reading and writing data one byte at a time
 * */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ByteReader {
    public static void main(String[] args) {

//        declared kinda global to be accessed in try-catch-final block
        FileInputStream myfile = null;

        try {
//            opening a byte stream and pointing to a file...double \ cus it's a special char...prints only +ve integers
            myfile = new FileInputStream("C:\\Users\\Mr. Erbynn\\Desktop\\erbynn.gif");

//            read all byte as int...need while_loop when reading
            while (true){
                int intValueOfByte = myfile.read();
                System.out.println(intValueOfByte);

//                reaching the end of the file is negative...thus jump out/exit the loop
                if (intValueOfByte == -1){
                    break;
                }
            }
        }catch (Exception ex){
            System.out.println("could not read file: " + ex.toString());
        }
        finally {
           try{
//               must close file in finally block
               myfile.close();
           }catch (Exception ex){
                ex.printStackTrace();
           }
            System.out.println("Done reading from file");
        }

    }
}
