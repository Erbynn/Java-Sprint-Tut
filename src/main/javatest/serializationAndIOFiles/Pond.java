package serializationAndIOFiles;

/*
* Serialization is all or nothing
* Testing error exception in serialization
* Either the entire object graph is serialized correctly or serialization fails
* */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//pond object can be serialized
public class Pond implements Serializable {

//    Class Pond has one instance variable, a Duck...Pond HAS-A Duck
    private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();

        try {
            FileOutputStream fs = new FileOutputStream("pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

//            when myPond(a Pond object) serialized, its Duck instance variable automatically gets serialized
            os.writeObject(myPond);
            os.close();

        } catch (Exception ex){
            ex.printStackTrace();
        }

    }


//    since the Duck ref variable in Pond will be automatically serialized, its Class must be serialized
    public class Duck {
        // do something
    }
}
