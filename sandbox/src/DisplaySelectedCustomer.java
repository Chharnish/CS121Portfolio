import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
//usual suspects
public class DisplaySelectedCustomer {
    public static void main(String[] args) throws FileNotFoundException {
        //ima try this and see if it doesn't break. shouldn't break.
       try{
            Scanner input = new Scanner(System.in);
            File inFile = new File("Customers.txt");
            Scanner fileIn = new Scanner(inFile);

            System.out.println("Please enter the id for the customer you wish to print:");
            int ID = input.nextInt();
            //gonna define line as null for now
            String line = null;
            while (fileIn.hasNextLine()) {
                line = fileIn.nextLine();
                //gonna split each string in the line by the spaces and assign them to an array index. This will make working with the data better.
                String[] custData = line.split("\\s+");
                if (Integer.parseInt(custData[0]) == ID) {
                    System.out.println(line);
                    //will set line to a printable line instead of null.
                    break;

                }
                //keeps the line as null until the if statement returns true.
                line = null;
            }
            //seeing if line is still null to print my error out.
            if(line == null) {
                System.err.println("Customer not found!");
            }
            input.close();
            fileIn.close();
            //memory savors :D
        }
       //I was wrong.. it broke
       catch (FileNotFoundException e) {
           System.err.println("File not found!");
       }
    }
}
