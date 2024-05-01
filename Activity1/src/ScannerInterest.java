import java.util.Scanner;
public class ScannerInterest {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    double totalAccount;
    double principal;
    double interestRate;
    int timesCompound;
    int timesYear;

    System.out.print("What is the principal amount that was in the account? ");
    principal = scnr.nextDouble();

    System.out.print("What is the annual interest rate? ");
    interestRate = scnr.nextDouble();
    interestRate = interestRate / 100;

    System.out.print("How many times per year is the interest compounded? ");
    timesCompound = scnr.nextInt();

    System.out.print("How many years will the account be left to earn interest? ");
    timesYear = scnr.nextInt();

    totalAccount = principal * (Math.pow(1 + (interestRate / timesCompound), (timesCompound * timesYear)));

    System.out.printf("The total after %s is $%.2f",timesYear, totalAccount);

    }
}
