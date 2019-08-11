package conditionalPlay;

/**
 * This method takes the result of a test(in int) and
 * returns a letter A,B,C,D depending on the argument
 */

public class ReportCard {

//    since remain same for all instances and not change for particular instance, thus static
    public static char convertScoreToGrade(int testScore) {

        char grade;

        if (testScore >= 90) grade = 'A';
        else if (testScore >= 80 && testScore < 90) grade = 'B';
        else if (testScore >= 70 && testScore < 80) grade = 'C';
        else if (testScore >= 60 && testScore < 70) grade = 'D';
        else grade = 'E';

        return grade;
    }


//    ReportCard(float onScore){
//        onScore = onScore;
//    }
//
//    ReportCard(){
//
//    }


    public static void main(String[] args) {
        ReportCard rc = new ReportCard();

        char grade = rc.convertScoreToGrade(30);
        System.out.println("Grade: " + grade);

        grade = rc.convertScoreToGrade(80);
        System.out.println("Grade: " + grade);

/*       accessing without instantiating...
         since convertScoreToGrade() in same class no need use `ReportCard.convertScoreToGrade(70)`
 */
        char staticGrade = convertScoreToGrade(56);
        System.out.println("static: " + staticGrade );
    }

}
