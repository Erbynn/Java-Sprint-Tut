package arrayListPckg;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
//v        creating and populating array list
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("betty");
        friends.add("mike");
        friends.add("james");
        friends.add("priscilla");

        int friendsCount = friends.size();

        for(int i = 0; i < friendsCount; i++ ){
            System.out.println("Friend #" + (i+1) + ": " + friends.get(i));
        }
    }
}
