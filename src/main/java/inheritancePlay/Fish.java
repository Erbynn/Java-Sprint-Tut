/**
 * Playing around with inheritance
 */

package inheritancePlay;

public class Fish extends Pet {

    int currentDepth = 0;

    public int div(int howDeep){
        currentDepth = currentDepth + howDeep;
        System.out.println("Diving for " + howDeep + " feet");
        System.out.println("I am at " + currentDepth + " below the sea level");

        return currentDepth;
    }


//    `this` keyword
//    Fish(int currentDepth){
//        this.currentDepth = currentDepth;
//        System.out.println(currentDepth);
//    }


//    Method overriding from Pet Class...same signature...final keyword could make super say() unoverriddable
    public String say(String sayWhat){
        String fishResponse = "Not aware fish no dey talk ?";
        return fishResponse;
    }


}
