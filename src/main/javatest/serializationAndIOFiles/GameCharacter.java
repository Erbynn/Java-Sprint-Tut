package serializationAndIOFiles;

/*
* The GameCharacter Class for GameSaveTest
* */

import java.io.Serializable;

public class GameCharacter implements Serializable {

//    instance variables
    int power;
    String type;
    String[] weapons;

//    constructor to build the class....setter
    public GameCharacter(int p, String t, String[] w){
        power = p;
        type = t;
        weapons = w;
    }

//    getter

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        String weaponList = "";

        for (int i = 0; i < weapons.length; i++) {
            weaponList += weapons[i] + ", ";
        }
        return weaponList;
    }
}
