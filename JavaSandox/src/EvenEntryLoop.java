import java.util.*;
public class EvenEntryLoop {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int inNum = -1;
        while (inNum != 999) {
            System.out.print("Please enter an even number or the number 999 to stop: ");
            inNum = input.nextInt();
            if (inNum == 999){
                break;
            }
            if ((inNum % 2) == 0) {
                System.out.println("Good job! Thank you for inputting an even number!");
            }
            else {
                System.out.println("Error! Number inputted is not an even number. Try again!");
            }
        }
        input.close();
    }
}
