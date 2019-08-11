package filehandler;

import java.io.*;

public class BufferStreamWriter {
    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4,5};
        FileOutputStream myFile = null;
        BufferedOutputStream buff = null;

        try {
//            making sure all bytes from buffer are pushed out to the stream file
            myFile = new FileOutputStream("bufTest.dat");
            buff = new BufferedOutputStream(myFile);

            for(int i = 0; i < someNumbers.length; i++){
                buff.write(someNumbers[i]);
            }
        } catch (IOException e) {
            e.getMessage();
        }finally {
            try {
//                deal with buffer before file
                buff.flush();   // call when buffer stream writing is finished
                buff.close();
                myFile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Done writing into file successfully.");

        }
    }
}
