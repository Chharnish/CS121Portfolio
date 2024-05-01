import java.util.*;
public class MovieSimulationFour {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //defining arrays
        String movieNames[] = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer", "恋をしたのは"};
        String movieTypes[] = {"2D", "2D", "3D", "4D","Jap"};
        double moviePrices[] = {15.25, 20.15, 18.11, 22.12, 600.32};
        final int movTotals = movieNames.length;
        final int ROW = 5;
        final int COLUMN = 10;
        int theaterSeats[][] = new int[ROW][COLUMN];

        theaterSeats = setSeatAvailability(theaterSeats, ROW, COLUMN);
        System.out.printf("%5s %20s %17s", "Movie Name", "Movie Type", "Movie Price");

        for (int i = 0; i < movTotals; i++) {
            System.out.printf("\nMovie #%d: %s %12s %12s %.2f ", i + 1, movieNames[i], movieTypes[i], "$", moviePrices[i]);
        }
        int movSel = selectMovie(movieNames);
        displaySelectedMovie(movieNames[movSel], movieTypes[movSel], moviePrices[movSel]);
        theaterSeats = randomizeAvailability(theaterSeats, ROW, COLUMN);
        displaySeatAvailability(theaterSeats, ROW, COLUMN);
        selectSeating(theaterSeats);
        System.out.println("All movie seats selected. Enjoy your Movie!");

        input.close();
    }
    static void selectSeating(int seats[][]) {
        System.out.print("\nInput the amount of tickets you would like to buy: ");
        int tickets = input.nextInt();
        for (int i = 0; i < tickets;) {
            System.out.printf("\nPlease select an available seat (eg. A4) for ticket #%d: ", i+1);
            String seatSel = input.next();
            int rowIndex = seatSel.charAt(0)-65;
            int colIndex = Integer.parseInt(String.valueOf(seatSel.charAt(1)))-1;
            if (seats[rowIndex][colIndex] == 0) {
                seats[rowIndex][colIndex] = 1;
                System.out.println("Seat Selected Successfully!");
                i++;
            }
            else {
                System.out.println("That seat is already taken!");
            }
        }

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
        int index = 0;
        char rowLet = 'a';
        System.out.println("-----------------------AVAILABLE SEATS--------------------------\n Seating Availability: [1 = unavailable, 0 = available]");
        System.out.println("   1  2  3  4  5  6  7  8  9  10\n---------------------------------");
        for (int[] row : theaterSeats) {
            switch(index) {
                case 0:
                    rowLet = 'A';
                    break;
                case 1:
                    rowLet = 'B';
                    break;
                case 2:
                    rowLet = 'C';
                    break;
                case 3:
                    rowLet = 'D';
                    break;
                case 4:
                    rowLet = 'E';
                    break;
            }
            System.out.printf("%s |", rowLet);
            for (int column: row) {
                System.out.printf("%d  " , column);
            }
            System.out.println();
            index++;
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

