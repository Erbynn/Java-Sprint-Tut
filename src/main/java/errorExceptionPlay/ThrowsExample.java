package errorExceptionPlay;

import java.io.IOException;

public class ThrowsExample {
    void getAllScore() throws IOException{
        Readable file = null;
    }

    public static void main(String[] args) {
        ThrowsExample te = new ThrowsExample();
        System.out.println("List of Scores");

        try {
            te.getAllScore();
        }catch (IOException e){
            System.out.println("not list found");
        }
    }
}


