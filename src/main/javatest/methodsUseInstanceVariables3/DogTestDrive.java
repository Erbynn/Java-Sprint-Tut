package methodsUseInstanceVariables3;

import java.util.ArrayList;

public class DogTestDrive {
    public static void main(String[] args) {
//        Dog smallD = new Dog();
//        smallD.size = 12;
//
//        Dog mediumD = new Dog();
//        mediumD.size = 30;
//
//        Dog bigD = new Dog();
//        bigD.size = 70;
//
//        smallD.bark();
//        mediumD.bark();
//        bigD.bark();

        ArrayList<Dog> myDogList = new ArrayList<Dog>();
        Dog aDog = new Dog();
        myDogList.add(aDog);

        Dog bDog = new Dog();
        myDogList.add(bDog);

        System.out.println(myDogList);

        Dog d = myDogList.get(0);
        System.out.println(d);

        Object o = new Dog();
        System.out.println("getClass: " + o.getClass());

//        Dog c = (Dog) o;

        if (o instanceof Dog) {
            Dog c = (Dog) o;
            System.out.println("Casted");
        }

    }
}
