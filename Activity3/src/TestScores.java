import javax.swing.*;
public class TestScores {
    public static void main(String[] args) {
        int test1 = 0;
        int test2 = 0;
        int test3 = 0;

        test1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first test score."));
        test2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second test score."));
        test3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third test score."));

        int average = (test1 + test2 + test3) / 3;
        char letterGrade;
        if ((average >= 90) && (average <= 100)) {
            letterGrade = 'A';
        }
        else if ((average >= 80) && (average <= 89)){
            letterGrade = 'B';
        }
        else if ((average >= 70) && (average <= 79)) {
            letterGrade = 'C';
        }
        else if ((average >= 60) && (average <= 69)) {
            letterGrade = 'D';
        }
        else if (average < 60) {
            letterGrade = 'F';
        }
        else {
            letterGrade = 'W';
        }
        JOptionPane.showMessageDialog(null, String.format("The average test score is %s%%", average) + String.format(" with a letter grade of %s.", letterGrade));

        }

}
