package ecapsulationTest;

public class DogTestDrive {
    public static void main(String[] args) {

        Dog dogOne = new Dog();
        dogOne.setSize(70);

        System.out.println("DogOne of size " + dogOne.getSize() + "barks ");
        dogOne.bark();


        Dog dogRefTwo = new Dog();
        dogRefTwo.setSize(8);

        System.out.println("DogTwo with size " + dogRefTwo.getSize() + "barks ");
        dogRefTwo.bark();
    }
}
