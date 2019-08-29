package ecapsulationTest;

public class DogTestDrive {
    public static void main(String[] args) {

        Dog dogOne = new Dog();
        dogOne.setSize(70);

        System.out.println("DogOne of size " + dogOne.getSize() + "barks ");
        dogOne.bark();


        Dog dogTwo = new Dog();
        dogTwo.setSize(8);

        System.out.println("DogTwo with size " + dogTwo.getSize() + "barks ");
        dogTwo.bark();
    }
}
