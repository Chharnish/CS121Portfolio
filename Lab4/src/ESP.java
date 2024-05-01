import java.util.*;
public class ESP {
    public static void main(String[] args) {
        //init util variables
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        //init main variables
        int comSel;
        String comColor = "black";
        String userIn;
        int guess = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("\nAvailable colors:\nRed  Green  Blue  Orange  Yellow");
            System.out.println("please pick a color:");
            userIn = input.next().toUpperCase();
            comSel = rand.nextInt(5);
            switch (comSel) {
                case 0:
                    comColor = "RED";
                    break;
                case 1:
                    comColor = "GREEN";
                    break;
                case 2:
                    comColor = "BLUE";
                    break;
                case 3:
                    comColor = "ORANGE";
                    break;
                case 4:
                    comColor = "YELLOW";
                    break;
                default:
                    comColor = "BLACK";
                    break;
            }

            if (comColor.equals(userIn)) {
                guess++;
                System.out.println("That is correct! The computer chose " + comColor);
            } else {
                System.out.println("That answer is incorrect! The computer chose " + comColor);
            }
        }
            System.out.println("The game is complete! you guessed " + guess + "/10 correctly!");

    }
}
