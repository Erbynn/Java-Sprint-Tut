/*Dabbling with Serialization and files I/O operations*/

package serializationAndIOFiles;
import java.io.*;

//making object flatten and saveble...no methods to implement
public class Box implements Serializable {

//    saves state - the value of these
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {

        Box myBox = new Box();
        myBox.setHeight(30);
        myBox.setWidth(50);

//        i/o operations
        try {
            FileOutputStream fos = new FileOutputStream("foo.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myBox);
            oos.close(); // closing at the objectStream at high-level automatically closes fileStream at low-level
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
