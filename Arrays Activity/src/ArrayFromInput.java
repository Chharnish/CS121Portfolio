import java.util.*;
public class ArrayFromInput {
    public static void main(String[] args) {
        //declaring special variables
        Scanner input = new Scanner(System.in);
        //declaring variables
        String [] planets = new String[2];
        int [] size = new int[2];
        int [] distance = new int[2];
        //planets :D
        System.out.println("You are making 2 new planets!");

        for (int i = 0; i < planets.length; i++) {
            System.out.print("Please enter the name of planet #" + (i+1) + ": ");
            planets[i] = input.next();
            System.out.print("Please enter the size of " + planets[i] + ": ");
            size[i] = input.nextInt();
            System.out.print("Please enter the distance in millions of miles from the sun for " + planets[i] + ": ");
            distance[i] = input.nextInt();
        }
        System.out.printf("%-10s %-6s %s", "Planet", "Size", "Distance from sun");

        for (int j = 0; j < planets.length; j++) {
            System.out.printf("\n%-10s: %-6d %d", planets[j], size[j], distance[j]);

        }
    }
}
