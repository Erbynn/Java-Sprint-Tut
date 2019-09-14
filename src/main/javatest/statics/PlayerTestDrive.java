/*
* This program counts the number of objects
* created for a class making use of static variables
* */

package statics;

public class PlayerTestDrive {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Papa");
        Player two = new Player("John");
        System.out.println(Player.playerCount);

        PlayerTestDrive pt = new PlayerTestDrive();
        pt.setSize(20);
        System.out.println(pt.getSize());

//        System.out.println(size); // Error! ... cannot access non-static variable from a static method
        
    }
}
