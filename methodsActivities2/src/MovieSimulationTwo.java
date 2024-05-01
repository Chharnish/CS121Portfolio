import java.util.*;
public class MovieSimulationTwo {
    public static void main(String[] args){
        //defining special variables
        //defining arrays
        int movTotals = 4;
        String movieNames [] = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
        String movieTypes [] = {"2D", "2D", "3D", "4D"};
        double moviePrices []= {15.25,20.15,18.11,22.12};

        final int ROW = 5;
        final int COLUMN = 10;
        int theaterSeats [][] = new int [ROW][COLUMN];

        theaterSeats = setSeatAvailability(theaterSeats, ROW, COLUMN);
        System.out.printf("%5s %20s %17s", "Movie Name", "Movie Type", "Movie Price");

        for (int i = 0; i < movTotals; i++) {
            System.out.printf("\nMovie #%d: %s %12s %12s %.2f ", i+1, movieNames[i], movieTypes[i], "$", moviePrices[i]);
        }

        System.out.println("\n-----------INITIAL SEATS------------");
        System.out.println("Seating Availability: [1 = unavailable ; 0 = available");
        displaySeatAvailability(theaterSeats);
        theaterSeats = randomizeAvailability(theaterSeats, ROW, COLUMN);
        System.out.println("\n-------Random Generated Seats-------");
        System.out.println("Seating Availability: [1 = unavailable ; 0 = available");
        displaySeatAvailability(theaterSeats);







    }
    static int[][] setSeatAvailability(int theaterSeats[][], int ROW, int COLUMN) {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                theaterSeats[i][j] = 0;
            }
        }
        return theaterSeats;
    }
    static void displaySeatAvailability(int theaterSeats[][]) {
            for (int[] row : theaterSeats) {
                for (int column : row) {
                    System.out.printf("%d  " , column);
                }
            System.out.println();
            }
        }
    static int[][] randomizeAvailability(int theaterSeats[][],int ROW,int COLUMN) {
        Random random = new Random();
        for (int i = 0; i < ROW; i++){
            for (int j = 0; j < COLUMN; j++){
                theaterSeats[i][j] = random.nextInt(2);
            }
        }
        return theaterSeats;
    }
}

