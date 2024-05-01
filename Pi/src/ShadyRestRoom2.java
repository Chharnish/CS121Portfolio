import java.util.*;
public class ShadyRestRoom2 {
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
        String [][] rooms = {
                {"None", "Queen bed", "King bed", "Suite with king bed and pullout chair"},
                {"None", "Lake view", "Park view"}
        };
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
        //new prompt
        int choice2 = 0;
        if (price != 0) {
            System.out.println("""
Would you like to add :                    
1) Lake view
2) park view
                    """);
            System.out.print(">>> ");
            if (input.hasNextInt()) {
                choice2 = input.nextInt();
            }
            switch (choice2) {
                case(1):
                    System.out.println("1) Lake view selected");
                    price += 15;
                    break;
                case(2):
                    System.out.println("2) park view selected");
                    //did not give a set value for park view
                    price += 20;
                    break;
                default:
                    System.out.println("Invalid selection. Default to lake view.");
                    choice2 = 1;
                    price += 15;
                    break;
            }

        }
        System.out.printf("Here is your selection:\n%s w/ %s for $%d", rooms[0][choice], rooms[1][choice2], price);

    }
}
