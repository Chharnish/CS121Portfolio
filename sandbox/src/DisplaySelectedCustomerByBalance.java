import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
//the usual suspects... who invited arraylists here?
public class DisplaySelectedCustomerByBalance {
    public static void main(String[] args) throws FileNotFoundException {
        //Alright let's do this one last time.
        try {
            Scanner input = new Scanner(System.in);
            //what a dumb file name, who named these?? Me? oh...
            File inFile = new File("Customers.txt");
            Scanner fileIn = new Scanner(inFile);
            ArrayList<String> customers = new ArrayList<>();

            System.out.println("Please enter a purchase amount to compare with customers ");
            double purchase = input.nextDouble();
            //looping each \n instance in text file
            while (fileIn.hasNextLine()) {
                String line = fileIn.nextLine();
                //we are separating you from your siblings...
                String[] custData = line.split("\\s+");
                //checking to see if the amount parsed as a double is bigger than what was inputted by the user :o
                if (Double.parseDouble(custData[3]) > purchase) {
                    //adding the line to my arraylist, so I can print it all out later.
                    customers.add(line);
                }
            }
            //yikes
            if (customers.toString().equals("[]")){
                System.err.println("Customers were too poor!");
            }
            else {
                for (String customer : customers) {
                    System.out.println(customer);
                }
            }
            //my memory is too precious for you to keep >:(
            input.close();
            fileIn.close();
        }
        //no file?
        catch(FileNotFoundException e){
            System.err.println("File not found!");
        }
    }
}
