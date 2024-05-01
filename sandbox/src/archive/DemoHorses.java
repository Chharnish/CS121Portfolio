import java.util.Scanner;
public class DemoHorses {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Horse regHorse = null;
        RaceHorse racingHorse = null;
        System.out.println("first regular horse.");
        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter the name of your horse: ");
            String name = input.nextLine();
            System.out.println("Please enter the color of your horse: ");
            String color = input.nextLine();
            System.out.println("Please enter the birth year of your horse: ");
            int birthYear = input.nextInt();
            input.nextLine();
            if (i == 0) {
                regHorse = new Horse(name, color, birthYear);
                System.out.println("Racing horse next");
            }
            else if (i == 1) {
                System.out.println("Please enter the number of races won for this horse: ");
                int RacesWon = input.nextInt();
                racingHorse = new RaceHorse(name, color, birthYear, RacesWon);
            }

        }
        System.out.println("Regular horse\n" + regHorse.toString() + "\n");
        System.out.println("Racing horse\n" + racingHorse.toString());
        input.close();
    }
}
