import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
//the usual suspects... and arraylists:)
public class DisplaySelectedCustomersByName {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner input = new Scanner(System.in);
            File inFile = new File("Customers.txt");
            Scanner fileIn = new Scanner(inFile);
            ArrayList<String> customers = new ArrayList<>();

            System.out.println("Please enter the customers last name to find customers");
            String lName = input.nextLine();
            //every single new line in the file goes through this.
            while (fileIn.hasNextLine()) {
                String line = fileIn.nextLine();
                //splitting the string by spaces and adding them into an array for easy data management since 1995!
                String[] custData = line.split("\\s+");
                if (custData[2].equals(lName)) {
                    //adding the line to my arraylist if the lastname matches :)
                    customers.add(line);
                }
            }
            //no names found, try again
            if (customers.toString().equals("[]")){
                System.err.println("Customers last names do not match what was provided!");
            }
            else {
                for (String customer : customers) {
                     System.out.println(customer);
                }
            }
            input.close();
            fileIn.close();
            //life savers but for memory
        }
        //no file??
        catch(FileNotFoundException e){
            System.err.println("File not found!");
        }
    }
}
