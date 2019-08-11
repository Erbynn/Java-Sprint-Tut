package inheritancePlay;

public class PetMain {
    public static void main(String[] args) {

        Pet myPet = new Pet();

        myPet.sleep();
        myPet.eat();
        String petSay = myPet.say("Pkay is my master");
        System.out.println(petSay);

//        invoked eat() without instantiating
        Pet.eat();

    }
}
