import java.io.*;
import java.util.*;
public class FileWrite {
    public static void main(String [] args) throws IOException {
        try{
            Scanner input = new Scanner(System.in);
            File outFile = new File("assets/mycourses1.txt");
            PrintWriter output = new PrintWriter(outFile);
            String course;
            String credits;
            String score;
            output.printf("%s %s %s\n", "course", "credits", "score");
            for (int i = 0; i < 3; i++) {
                System.out.println("Please input the course name");
                course = input.next();
                System.out.println("Please input the amount of credits");
                credits = input.next();
                System.out.println("Please input the score for your course");
                score = input.next();
                output.printf("%s %s %s\n", course, credits, score);
            }
            output.close();
        }
        catch(IOException e) {
            System.err.println("Oh noes! a problem has occurred and things didn't work out like how they were supposed to :(");
        }



    }
}
