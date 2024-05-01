import java.util.*;
public class ShadyRestRoom {
    public static void main (String[] args) {
        //special variables
        Scanner input = new Scanner(System.in);

        System.out.print("""
Welcome to the Shady Rest Hotel!
Prices:
1) Queen bed
2) King bed
3) Suite w/ King bed & pullout couch
                """);
        //variables
        int choice = 0;
        int price = 0;
        System.out.print(">>> ");
        if (input.hasNextInt()) {
            choice = input.nextInt();
        }
        switch (choice) {
            case(1):
                System.out.println("1) Queen Bed selected");
                price += 125;
                break;
            case(2):
                System.out.println("2) King Bed selected");
                price += 139;
                break;
            case(3):
                System.out.println("3) Suite w/ King bed & pullout couch selected");
                price += 165;
                break;
            default:
                System.out.println("That input was invalid");
                price += 0;
                break;
        }

    }
}
