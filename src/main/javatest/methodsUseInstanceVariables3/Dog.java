package methodsUseInstanceVariables3;
//the state affects method
public class Dog {
    int size;
    String name;

    void bark(){
        if (size > 60) System.out.println(" Whoof! whoof!!");
        if (size > 14) System.out.println("Ruff! Ruff!!");
        else System.out.println("Yip Yip!");
    }

}
