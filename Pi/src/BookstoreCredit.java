import java.util.*;
public class BookstoreCredit {
    public static void main(String[] args) {
        //declaring special variables
        Scanner input = new Scanner(System.in);
        //declaring variables
        System.out.print("Please enter your name: ");
        String name = input.next();
        System.out.print("Please enter your GPA: ");
        double GPA = input.nextDouble();
        //calculate for me pls
        calcPrint(name, GPA);
    }
    static void calcPrint(String name, double GPA) {
        int credit = (int) (GPA * 10.0);
        System.out.println("Student: " + name + "\nGPA: " + GPA + "\nBookstore credit received: $" + credit);
    }
}
