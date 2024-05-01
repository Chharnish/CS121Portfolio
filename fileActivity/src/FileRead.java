import java.io.*;
import java.util.*;
public class FileRead {
    public static void main(String [] args) throws FileNotFoundException{
        try {
            File inFile1 = new File("assets/courses.txt");
            Scanner input = new Scanner(inFile1);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        }
        catch(FileNotFoundException e) {
            System.err.println("Wuh woh ur file was not found :( try again...");
        }


    }
}
