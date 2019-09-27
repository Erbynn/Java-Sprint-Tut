package serializationAndIOFiles;

/*
 * Serializable example
 * Saving and restoring the game characters
 * */

import java.io.*;

public class GameSaverTest {

    public static void main(String[] args) {

//        making some characters
        GameCharacter one = new GameCharacter();
        GameCharacter two = new GameCharacter();
        GameCharacter three = new GameCharacter();

        // imagine code that does things with the characters that might change their state values

        try {
//            save object
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);

            os.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }

//        set the objects to null so that they can't access the object on the heap
        one = null;
        two = null;
        three = null;


//        Now, restoring/reading them back from the file
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("game.ser"));

//            cast object to the type you know already because the return type of readObject() meathod is object
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

//        verify.....check to see if it worked
            System.out.println("One's type: " + oneRestore.getType());
            System.out.println("One's type: " + twoRestore.getType());
            System.out.println("One's type: " + threeRestore.getType());

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
