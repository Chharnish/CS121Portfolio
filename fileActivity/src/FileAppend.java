import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class FileAppend {
    public static void main(String [] args) throws IOException {
        try{
           FileWriter inFile = new FileWriter("assets/mycourses1.txt", true);
            //FileWriter inFile = new FileWriter("C:\\Users\\Jeremy\\Desktop\\BSU\\OneDrive - Ball State University\\Spring 2024\\CS 121\\Java\\fileActivity\\assets\\mycourses1.txt", true);
            PrintWriter output = new PrintWriter(inFile);
            String course = JOptionPane.showInputDialog("Enter course name");
            String credits = JOptionPane.showInputDialog("Enter course credits");
            String score = JOptionPane.showInputDialog("Enter course score");

            output.printf("%s %s %s", course, credits, score);
            inFile.close();
            output.close();
        } catch (IOException e) {
            System.err.println("No files were found in the CIA database O_O' ");
        }

    }
}
