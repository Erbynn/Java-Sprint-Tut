package errorExceptionPlay;

public class TestStactTrace {
    TestStactTrace(){
        divideByZero();
    }

    public float divideByZero(){
        return 10 / 0;
    }


    public static void main(String[] args) {
        try {
            new TestStactTrace();
        }catch (Exception e){
            System.out.println("No fit divide by 0 ..." + e.toString() + "\n" + e.getMessage() + "\n" );
            e.printStackTrace();
        }
    }
}
