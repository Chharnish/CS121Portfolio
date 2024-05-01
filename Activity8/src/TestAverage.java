import java.util.*;
@java.lang.SuppressWarnings("ALL")
public class TestAverage {
    public static void main(String[] args) {
        //declaring Special variables
        Scanner input = new Scanner(System.in);
        //declaring variables
        int testSum, score;
        double testAverage;

        //asking for the stuff now
        System.out.println("How many student are there in total?");
        int students = input.nextInt();
        System.out.println("How many test scores do each student have?");
        int tests = input.nextInt();
        //froot loops time
        for (int i = 1; i <= students; i++){
            System.out.println("Student numer " + i);
            System.out.println("====================");
            testSum = 0;
            for (int j = 1; j <= tests; j++) {
                System.out.print("Enter score " + j + ": ");
                score = input.nextInt();
                testSum += score;
            }
            testAverage = Math.round(((double)testSum/tests)*100.0)/100.0;

            System.out.println("The average for student " + i + " is " + testAverage);

        }
    }
}
