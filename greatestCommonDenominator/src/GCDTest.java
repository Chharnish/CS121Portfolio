import java.util.Scanner;
public class GCDTest {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter values for n1 and n2.");
        System.out.print("n1: ");
        int n1 = input.nextInt();
        System.out.print("n2: ");
        int n2 = input.nextInt();

        System.out.println("for loop GCD: " + gcd.findGCDForLoop(n1, n2));
        System.out.println("while loop GCD: " + gcd.findGCDWhileLoop(n1, n2));
        System.out.println("Recursion GCD: " + gcd.findGCDRecursively(n1, n2));
    }
}
