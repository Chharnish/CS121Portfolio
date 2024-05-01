import javax.swing.*;
public class BookClubPoints {
    public static void main(String[] args) {
        // declaring variables
        int booksPerMonth;
        int points = 0;

            booksPerMonth = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of books purchased this month."));

        if(booksPerMonth == 0){
            points = 0;
        }
        else if (booksPerMonth == 1){
            points = 5;
        }
        else if (booksPerMonth == 2) {
            points = 10;
        }
        else if (booksPerMonth == 3) {
            points = 15;
        }
        else if (booksPerMonth >= 4) {
            points = 60;
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Number");
        }

        JOptionPane.showMessageDialog(null, String.format("You've earned %d points", points));
    }
}
