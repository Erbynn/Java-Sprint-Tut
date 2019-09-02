package battleShip;

public class SimpleDotCom {

    int[] locationCells;
    int numberOfHit = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);

        String result = "miss";

        for(int cell : locationCells){
            if (guess == cell) {
                result = "hit";
                numberOfHit++;
                break;
            }
        }

        if (numberOfHit == locationCells.length) return "kill";

        System.out.println(result);

        return result;
    }
}
