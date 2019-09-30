package serializationAndIOFiles;

/*
* Skip this
* Get back this playground code last
* Making use of transient instance variable
* */

import java.io.*;

public class DungeonGame implements Serializable {

    public int x = 3;
    transient long y = 4;
    private short z = 5;

//    Because statically assigned, setters Not needed
    public int getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public short getZ() {
        return z;
    }

}

class DungeonTest{
    public static void main(String[] args) {
        DungeonGame d = new DungeonGame();
        System.out.println(d.getX() + d.getY() + d.getZ());

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dg.ser"));
            oos.writeObject(d);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dg.ser"));
            d = (DungeonGame) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        After deserializing
        System.out.println(d.getX());
        System.out.println(d.getY());
        System.out.println(d.getZ());
        System.out.println(d.getX() + d.getY() + d.getZ());

    }
}



