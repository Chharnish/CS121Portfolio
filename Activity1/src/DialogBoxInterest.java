import javax.swing.*;
public class DialogBoxInterest {
    public static void main (String[] args) {

        double totalAccount;
        double principal;
        double interestRate;
        int timesCompound;
        int timesYear;

        principal = Double.parseDouble(JOptionPane.showInputDialog("What is the principal amount that was in the account?"));
        interestRate = Double.parseDouble(JOptionPane.showInputDialog("What is the annual interest rate?"));
        interestRate = interestRate / 100;
        timesCompound = Integer.parseInt(JOptionPane.showInputDialog("How many times per year is the interest compounded?"));
        timesYear = Integer.parseInt(JOptionPane.showInputDialog("How many years will the account be left to earn interest"));

        totalAccount = principal * (Math.pow(1 + (interestRate / timesCompound), (timesCompound * timesYear)));

        JOptionPane.showMessageDialog(null,"The total after " + String.format("%s", timesYear) + " years will be $" + String.format("%.2f", totalAccount));
    }
}
