import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//usual suspects
public class DisplaySavedCustomerList {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            File inFile = new File("Customers.txt");
            Scanner input = new Scanner(inFile);

            //gonna grab each instance of a line in the txt file
            while (input.hasNextLine()){
                String line = input.nextLine();
                //reads the line in the file and prints it out.
                System.out.println(line);
            }
            input.close();
            //save your memory my friends
        }
        catch (FileNotFoundException e) {
            //oh no the horror
            System.err.println("File not found!");
        }
    }
}
