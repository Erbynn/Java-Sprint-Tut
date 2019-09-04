package battleShip;

import java.util.ArrayList;

public class DotComBust {

//    declare and initiating the needed variables
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

//    make 3 DotCom object, give 'em names and stick 'em in the ArrayList
    private void setUpGame(){

//        make some DotComs and give 'em locations
        DotCom one = new DotCom();
        one.setName("Go.com");
        DotCom two = new DotCom();
        two.setName("Come.com");
        DotCom three = new DotCom();
        three.setName("Here.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

//        print brief instructions for user
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Go.com, Come.com and Here.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        System.out.println("branching ....");

//        request from the helper a location to set each DotCom
        for (DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

//    message telling user how he did in the game
    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only too you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
