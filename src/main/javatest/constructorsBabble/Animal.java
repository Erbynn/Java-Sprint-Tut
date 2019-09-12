// Supperclass constructors with arguments
//...tracking the Constructor Chain Reaction

package constructorsBabble;

public class Animal {
    private String Name;

    public String getName() {
        System.out.println(6);
        return Name;
    }

    public Animal(String myName){
        System.out.println(2);
        Name = myName;
        System.out.println(3);
    }
}
