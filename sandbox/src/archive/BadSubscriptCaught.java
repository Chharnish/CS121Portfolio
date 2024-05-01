import java.util.Scanner;
public class BadSubscriptCaught {
    //Static array that contains 8 names to be called by the main method
    static String[] names = new String[]{"James", "John", "Mike","Kayla", "Gigi", "Natalie", "Sophie", "Michael"};
    //Main method that also checks for improper input type from scanner
    public static void main(String[] args) throws NumberFormatException {
        Scanner input = new Scanner(System.in);
        String sel = "";
        //while loop to keep looping and will stop as soon as q is typed in the scanner
        while (!sel.equalsIgnoreCase("q")) {
            try {
                System.out.println("Enter a number to see an array element between 1-8 or enter q to quit");
                sel = input.nextLine();
                if (sel.equalsIgnoreCase("q")) {
                    break;
                }
                int intSel = Integer.parseInt(sel);
                getName(intSel);
            //catch to the improper input
            } catch (NumberFormatException e) {
                System.err.println("That was not a valid input. Please try again!");
            }
        }
        //Memory is a precious thing to have
        input.close();
    }
    //method to check for the out-of-bounds exception
    public static void getName(int numName) throws ArrayIndexOutOfBoundsException{
        try{
            System.out.println(names[numName-1]);
        }
        //if the array is not in bounds, will print out this instead.
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.printf("Could not find name using the number %d!\n", numName);
        }
    }
}
