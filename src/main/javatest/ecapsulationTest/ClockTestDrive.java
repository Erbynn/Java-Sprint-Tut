package ecapsulationTest;

public class ClockTestDrive {
    public static void main(String[] args) {

        Clock c = new Clock();

        c.setTime("12:40");
        String tod = c.getTime();

        System.out.println("Time: " + tod);
    }
}
