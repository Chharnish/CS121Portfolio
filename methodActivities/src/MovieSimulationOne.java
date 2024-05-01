import java.util.*;
 class MovieSimulationOne {
     public static void main(String[] arg) {
         //special variables defined / gone wild :o
         Scanner input = new Scanner(System.in);
         //defining variables
         System.out.print("Please input the amount of movies you would like to enter.\n>>> ");
         int movTotals = input.nextInt();
         //defining main array
         String [] movieNames = new String[movTotals];
         String [] movieTypes = new String[movTotals];
         int [] movieAvailability = new int[movTotals];
         double [] moviePrices = new double[movTotals];
         for (int i = 0; i < movTotals; i++) {
             System.out.printf("Enter the name for movie #%d: ", i+1);
             movieNames[i] = input.nextLine();
             movieNames[i] = input.nextLine();
             System.out.printf("\nEnter the movie type for %s: ", movieNames[i]);
             movieTypes[i] = input.next();
             System.out.printf("How many available seats are there for %s: ", movieNames[i]);
             movieAvailability[i] = input.nextInt();
             System.out.printf("How much does %s cost?: $", movieNames[i]);
             moviePrices[i] = input.nextDouble();
         }
         System.out.printf("%5s %20s %25s %17s", "Movie Name", "Movie Type", "Available Seats", "Movie Price");

         for (int i = 0; i < movTotals; i++) {
             System.out.printf("\nMovie #%d: %s %12" + "s %20s %15s %.2f ", i+1, movieNames[i], movieTypes[i], movieAvailability[i], "$", moviePrices[i]);
         }

     }
}
