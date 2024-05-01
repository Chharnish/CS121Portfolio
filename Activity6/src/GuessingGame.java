import javax.swing.*;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        //declaring random
        Random rand = new Random();
        //declaring variables
        int answer = rand.nextInt(101);
        int tries = 0;
        String initGuess;
        char quit = 'a';
        int guess = -1;
        //actual game
        while (guess != answer) {
            initGuess = JOptionPane.showInputDialog("Input your guess between 1 and 100 or enter \"q\" to quit.");
            if (initGuess.equals("q")) {
                quit = 'q';
            }
            else {
                guess = Integer.parseInt(initGuess);
            }
            if (guess == answer) {
                JOptionPane.showMessageDialog(null, "Correct!");
            }
            if (quit == 'q') {
                guess = answer;
                JOptionPane.showMessageDialog(null, "quitter...");
            }

            else if (guess > answer) {
                JOptionPane.showMessageDialog(null, "Guess is too high. Try Again.");
            }
            else if (guess < answer) {
                JOptionPane.showMessageDialog(null, "Guess is too low. Try again.");
            }
            tries += 1;

        }
        //print my statements
        JOptionPane.showMessageDialog(null, "the answer was " + String.format("%d.\n", answer) + String.format("with %d attempts!", tries));
    }
}
