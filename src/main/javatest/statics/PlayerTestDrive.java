/*
* This program counts the number of objects
* created for a class making use of static variables
* */

package statics;

public class PlayerTestDrive {
    public static void main(String[] args) {

        System.out.println(Player.playerCount);
        Player one = new Player("Papa");
        Player two = new Player("John");
        System.out.println(Player.playerCount);

    }
}
