import java.util.*;
public class CarCareChoice {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //such a cheap oil change
        //defining variable arrays
        String[][] services = {{"Oil change", "Tire Rotation", "Battery Check", "Brake Inspection"}, {"$25","$22","$15", "$5"}};

        //printing out the menu for the car care shop
        System.out.printf("%18s\n==============================\n", "services");
        for (int i = 0; i < services[0].length; i++) {
            System.out.printf("%s: %5s\n", services[0][i],services[1][i]);
        }
        System.out.print("please select an option: ");
        String sel = input.nextLine();
        int fin = 0;
        for (int i = 0; i < services[0].length; i++) {
            if (services[0][i].equalsIgnoreCase(sel)) {
                System.out.printf("%s Selected\nCost: %s", services[0][i], services[1][i]);
                fin++;
            }
        }
        if (fin == 0) {
            System.out.println("That was not a valid option!");
        }
        input.close();
    }
}
