import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        //defining special variables
        Scanner input = new Scanner(System.in);
        //defining variables
        System.out.print("Please input an integer to determine if it is a even or odd number: \n>>> ");
        int number = input.nextInt();

        boolean even = isEven(number);

        if (even) {
            System.out.printf("%d is an even number.", number);
        }
        else {
            System.out.printf("%d is an odd number.", number);
        }
    }
    static boolean isEven(int number) {
        //defining variables
        boolean even;
        even = (number % 2) == 0;
        return (even);
    }
}
