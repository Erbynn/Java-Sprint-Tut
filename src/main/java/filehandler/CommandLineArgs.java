package filehandler;
/*
* Command line arguments help to prevent hard-coding programs
* They are identified after the name of the java program file when running the program in terminal
* Inputs : Array of String passing them to the program at main()
* */
public class CommandLineArgs {
    public static void main(String[] args) {
        int numberOfArgs = args.length;

//        System.out.println("There are " + numberOfArgs + " arguments");
//        for(int i = 0; i < numberOfArgs; i++){
//            System.out.println("I've got " + args[i]);
//        }

        if (numberOfArgs != 2){
            System.out.println("Must provide only 2 arguments");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("Sum of args: " + (num1 + num2));
    }
}
