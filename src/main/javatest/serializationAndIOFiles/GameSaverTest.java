package serializationAndIOFiles;

/*
 * Serializable example
 * Saving and restoring objects. In this case, the game characters
 *
 * This is a basic class just for testing Serialization,
 * */

import java.io.*;

public class GameSaverTest {

    public static void main(String[] args) {

//        making some characters
        GameCharacter one = new GameCharacter(50, "Fighter", new String[]{"bow", "sword", "dust"});
        GameCharacter two = new GameCharacter(30, "Troll", new String[]{"bare hand", "big ax"});
        GameCharacter three = new GameCharacter(90, "Magician", new String[]{"Spells", "invisible"});

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
            System.out.println("One's weapon: " + oneRestore.getWeapons());

            System.out.println("Two's type: " + twoRestore.getType());
            System.out.println("Two's weapon: " + oneRestore.getWeapons());

            System.out.println("Three's type: " + threeRestore.getType());
            System.out.println("Three's weapon: " + oneRestore.getWeapons());

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
