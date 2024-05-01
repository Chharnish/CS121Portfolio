import java.util.*;
public class CountByAnything {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        final int START = 5;
        final int STOP = 500;
        System.out.print("Please input an integer to count by: ");
        int countBy = input.nextInt();
        System.out.println();
        int by50 = 0;
        for (int i = START; i <= STOP; i += countBy) {
            if (((i % 50) == 0 ) || (i / 50 != by50 )) {
                System.out.println();
                by50++;
            }
            System.out.printf("%d ", i);

        }
        input.close();
    }
}
