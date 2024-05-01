import java.io.*;
import java.util.Scanner;
//there were too many io things to import, so I just imported them all :/
public class WriteCustomerList {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        try {
            //appending or creating a file if it's not there
            FileWriter output = new FileWriter("Customers.txt", true);
            PrintWriter outFile = new PrintWriter(output);

            //boring mumbo jumbo
            System.out.println("PLease enter your ID number: ");
            int ID = input.nextInt();
            input.nextLine();
            //preventing this input from skipping
            System.out.println("Please enter your first name: ");
            String fName = input.nextLine();
            System.out.println("Please enter your last name: ");
            String lName = input.nextLine();
            System.out.println("Please enter the amount due: ");
            Double balance = input.nextDouble();
            //writes to a new line in the file.
            outFile.printf("%d %s %s %.2f\n", ID, fName, lName, balance);
            output.close();
            outFile.close();
            input.close();
        }
        catch (IOException e) {
            //uh oh
            System.err.println("A file error has occurred");
        }

    }
}
