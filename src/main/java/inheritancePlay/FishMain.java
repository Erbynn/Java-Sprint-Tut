package inheritancePlay;

public class FishMain {
    public static void main(String[] args) {
        Fish myFish = new Fish();

        myFish.div(2);
        myFish.div(5);
        int diveValue = myFish.div(3);
        System.out.println(diveValue + "feet");

        myFish.sleep();

        String fishResponse = myFish.say("Fish: pk is my master");
        System.out.println(fishResponse);

    }



}
