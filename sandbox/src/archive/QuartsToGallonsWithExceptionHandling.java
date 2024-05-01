import java.util.Scanner;
public class QuartsToGallonsWithExceptionHandling {
    //only one method?
    public static void main(String[] args) throws NumberFormatException {
        Scanner input = new Scanner(System.in);
        String sel = "";
        //will stop when sel is q
        while (!sel.equalsIgnoreCase("q")) {
            try {
                //trying this block out guys wish me luck
                System.out.println("Please enter the amount of quarts you would like to convert to gallons:");
                sel = input.nextLine();
                if (sel.equalsIgnoreCase("q")) {
                    break;
                }
                //division by 4????? gee whiz I hope this doesn't break
                Double gallon = Double.parseDouble(sel)/4.0;
                System.out.printf("Gallons: %.4s\n", gallon);
            }
            //catching to see if the input could not be converted to a double for some reason
            catch (NumberFormatException e) {
                System.err.println("Could not convert input into gallons. Please try again!");
            }
        }
        //MY PRECIOUS..... memory
        input.close();
    }
}
