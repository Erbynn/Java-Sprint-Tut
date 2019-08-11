
package breakAndContinue;


public class BreakContinue {

    public static void main(String[] args) {
        String[] players = {"Daniel", "Tetteh", "Kojo"};
        int totalPlayers = players.length;
        int counter = 0;

//        String theWinner = players[1];
//        System.out.println("Congrat! " + theWinner);
        System.out.println(totalPlayers + "," + counter);

        while (counter < totalPlayers){

            String thePlayer = players[counter];

            if (counter == 2) break;

//            if (counter == 2) continue;
//            if (thePlayer.equals("Kojo")) continue;

            System.out.println("Congrat! " + thePlayer);

            counter++;
        }

    }
}
