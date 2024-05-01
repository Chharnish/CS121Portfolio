import java.util.*;
public class Insurance {
    static void calculate(int birthyr,int year) {
        //mathing
        int age = year - birthyr;
        int policy = ((age/10)+15)*20;
        //printing
        System.out.println("Your policy is estimated to be: $" + policy);

    }
    public static void main(String[] args) {
        //declaring the special variables
        Scanner input = new Scanner(System.in);
        //prompts for the insurance thing
        System.out.println("Welcome to the Harrison Group Life Insurance policy estimator.");
        System.out.print("Please input the current year: ");
        int current_year = input.nextInt();
        System.out.print("Please input your birth year: ");
        int birth = input.nextInt();
        calculate(birth, current_year);

    }

}
