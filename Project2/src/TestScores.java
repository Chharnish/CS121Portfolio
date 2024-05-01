import java.util.*;
public class TestScores {
    public static void main(String[] args) {
        //declaring special variables
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        //declaring variables
        final int Size = rand.nextInt(10-3) + 3;
        int [] testScores = new int[Size];
        char [] letterGrades = new char[Size];
        System.out.printf("Enter your %d test scores.\n", Size);
        for (int i = 0; i < testScores.length; i++) {
            System.out.printf("Enter test %d score: ", i+1);
            testScores[i] = input.nextInt();
        }
        input.close();
        for (int i = 0; i < letterGrades.length; i++) {
            letterGrades[i] = getLetterGrade(testScores[i]);
        }
        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);


    }

    static char getLetterGrade(int score) {
        char grade = 'F';
        if (90 <= score && score <= 100) {
            grade = 'A';
        } else if (80 <= score && score <= 89) {
            grade = 'B';
        } else if (70 <= score && score <= 79) {
            grade = 'C';
        } else if (60 <= score && score <= 69) {
            grade = 'D';
        }
        return grade;
    }
    static void printGrades(int[] scores, char[] letter) {
        System.out.printf("%2s %10s\n", "Score", "Grades");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%1d %8s\n", scores[i], letter[i]);
        }
    }
    static void printHighestScore(int[] scores) {
        int high = 0;
        for (int score : scores) {
            if (score >= high) {
                high = score;
            }
        }
        System.out.printf("The highest score is %d\n", high);
        System.out.println("こにちは　げんきですか。");
    }
    static void printLowestScore(int[] scores) {
        int low = 100;
        for (int score : scores) {
            if (score <= low) {
                low = score;
            }
        }
        System.out.printf("The lowest score is %d\n", low);
    }
    static void printAverageScore(int[] scores) {
        double average = 0.0;
        int initAv = 0;
        for (int score : scores) {
            initAv += score;
        }
        average = (double) initAv / scores.length;
        System.out.printf("The average score is %.4s", average);
    }
}
