package ecapsulationTest;

public class DogTestDrive {
    public static void main(String[] args) {

        Dog dogOne = new Dog();

        dogOne.setSize(70);
        int isize = dogOne.getSize();

        System.out.println("DogOne of size " + isize + " barks ");
        dogOne.bark();


        Dog dogRefTwo = new Dog();
        dogRefTwo.setSize(8);

        System.out.println("\nDogTwo with size " + dogRefTwo.getSize() + " barks ");
        dogRefTwo.bark();


//        pet array of 2 references
        Dog[] pets = new Dog[2];

//        creating dog references
        pets[0] = new Dog();
        pets[1] = new Dog();

//        a bit change in how it is set and get
        pets[0].setSize(80);
        int size1 = pets[0].getSize();

        pets[1].setSize(50);
        int size2 = pets[1].getSize();

        System.out.println("Dog size " + size1);
        pets[0].bark();
        System.out.println("Dod size " + size2);
        pets[1].bark();

    }
}
