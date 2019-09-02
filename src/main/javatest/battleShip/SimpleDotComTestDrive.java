package battleShip;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotComTestDrive dot = new SimpleDotComTestDrive();

        int[] locations = {2,3,4};
        dot.setLocations(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

//        String testResult = "failed";
//
//        if ( result.equals("hit") ) {
//            testResult = "passed";
//        }
//
//        System.out.println(testResult);
    }
}
