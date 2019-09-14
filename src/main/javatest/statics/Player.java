package statics;

public class Player {

    private String name;
    static int playerCount = 0;

    Player(String n){
        name = n;
        playerCount++;
    }

}
