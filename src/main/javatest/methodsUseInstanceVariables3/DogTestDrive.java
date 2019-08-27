package methodsUseInstanceVariables3;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog smallD = new Dog();
        smallD.size = 12;

        Dog mediumD = new Dog();
        mediumD.size = 30;

        Dog bigD = new Dog();
        bigD.size = 70;

        smallD.bark();
        mediumD.bark();
        bigD.bark();
    }
}
