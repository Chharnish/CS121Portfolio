import java.util.*;
public class MovieSimulationThree {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //defining arrays
        int movTotals = 4;
        String movieNames[] = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
        String movieTypes[] = {"2D", "2D", "3D", "4D"};
        double moviePrices[] = {15.25, 20.15, 18.11, 22.12};

        final int ROW = 5;
        final int COLUMN = 10;
        int theaterSeats[][] = new int[ROW][COLUMN];

        theaterSeats = setSeatAvailability(theaterSeats, ROW, COLUMN);
        System.out.printf("%5s %20s %17s", "Movie Name", "Movie Type", "Movie Price");

        for (int i = 0; i < movTotals; i++) {
            System.out.printf("\nMovie #%d: %s %12s %12s %.2f ", i + 1, movieNames[i], movieTypes[i], "$", moviePrices[i]);
        }
        int movSel = selectMovie(movieNames);
        System.out.print(movSel);
        displaySelectedMovie(movieNames[movSel], movieTypes[movSel], moviePrices[movSel]);
        theaterSeats = randomizeAvailability(theaterSeats, ROW, COLUMN);
        displaySeatAvailability(theaterSeats, ROW, COLUMN);

/*
        System.out.println("\n-----------INITIAL SEATS------------");
        System.out.println("Seating Availability: [1 = unavailable ; 0 = available");
        displaySeatAvailability(theaterSeats);
        theaterSeats = randomizeAvailability(theaterSeats, ROW, COLUMN);
        System.out.println("\n-------Random Generated Seats-------");
        System.out.println("Seating Availability: [1 = unavailable ; 0 = available");
        displaySeatAvailability(theaterSeats);

 */
    }
    static void displaySelectedMovie(String name, String type, double price){
        System.out.println("------------------------------MOVIE SELECTION------------------------------");
        System.out.printf("%s %20s %20s", "Movie Selected", "Movie Type", "Movie Price");
        System.out.printf("\n%s %20s %20s %s \n", name, type, "$", price);


    }
    static int selectMovie(String movieNames[]) {
        String initsel = "none";
        boolean keepGoing = true;
        int sel = -1;
        while (keepGoing){
            System.out.print("\nPlease select a movie: ");
            initsel = input.next();
            for (int i = 0; i < movieNames.length; i++) {
                if (initsel.equals(movieNames[i])) {
                    keepGoing = false;
                    sel = i;
                }
            }
            if (sel == -1) {
                System.out.println("Movie not found! \n");
            }
        }
        return sel;
    }



    static int[][] setSeatAvailability(int theaterSeats[][], int ROW, int COLUMN) {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                theaterSeats[i][j] = 0;
            }
        }
        return theaterSeats;
    }

    static void displaySeatAvailability(int theaterSeats[][], int ROW, int COLUMN) {
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

