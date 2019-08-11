package inheritancePlay;

public class Pet {
    int age;
    float height;
    float weight;
    String color;

    public void sleep(){
        System.out.println("sleeping. Zzz...");
    }

//    eat() can be accessed without instantiating cus of `static`
    public static void eat(){
        System.out.println("eating. yummy!");
    }

    public String say(String aWord){
        String petResponse = "Ok! ok!! saying " + aWord;
        return petResponse;
    }
}
