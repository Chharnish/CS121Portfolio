import java.util.Scanner;
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        //declaring the scanner
        Scanner input = new Scanner(System.in);
        //declaring variables
        int gallon2Quarts = 4;
        System.out.println("How many quarts do you have in total?");
        int quartsNeeded = input.nextInt();
        int totalNeeded;
        int remainder;
        //basic needs
        totalNeeded = quartsNeeded / gallon2Quarts;
        //remainder of the total

        remainder = quartsNeeded % gallon2Quarts;
        //print statement
        System.out.println(String.format("The total needed for the job is %d gallons ", totalNeeded) + String.format("with %d quarts left over.", remainder));
    }
}
