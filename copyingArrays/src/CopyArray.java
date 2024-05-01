import java.util.*;
public class CopyArray {
    public static void main (String[] args) {
        //declaring special variables
        Scanner input = new Scanner(System.in);

        //declaring normal variables
        System.out.print("Enter number of array elements: ");
        int arrayQuantity = input.nextInt();
        final int [] numbers = new int[arrayQuantity];
        for (int i = 0; i < arrayQuantity; i++) {
            System.out.printf("Enter array element %d: ", i);
            numbers[i] = input.nextInt();
        }
        int[] numbersCopy = new int [arrayQuantity];
        for (int j = 0; j < arrayQuantity; j++) {
            numbersCopy[j] = numbers[j];
        }
        int [] numbersPow = new int [arrayQuantity];
        for (int k = 0; k < arrayQuantity; k++) {
            numbersPow[k] = (int)Math.pow((double)numbers[k], 2);
        }
        int [] numbersRev = new int [arrayQuantity];
        int rev = arrayQuantity-1;
        for (int l = 0; l < arrayQuantity; l++) {
            numbersRev[l] = numbers[rev];
            rev--;
        }
        System.out.println("Array 1\n=====================");
        for (int i = 0; i < arrayQuantity; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nArray 2\nCopy of Array 1\n=====================");
        for (int i = 0; i < arrayQuantity; i++) {
            System.out.print(numbersCopy[i] + " ");
        }
        System.out.println("\nArray 3\nPowers of Array 1\n=====================");
        for (int i = 0; i < arrayQuantity; i++) {
            System.out.print(numbersPow[i] + " ");
        }
        System.out.println("\nArray 4\nInverse of Array 1\n=====================");
        for (int i = 0; i < arrayQuantity; i++) {
            System.out.print(numbersRev[i] + " ");
        }
    }
}
