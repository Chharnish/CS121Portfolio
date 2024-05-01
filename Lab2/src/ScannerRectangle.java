import java.util.Scanner;
public class ScannerRectangle {
    public static void main(String[] args) {
        //init scanner attached to the word "in"
        Scanner in = new Scanner(System.in);
        //init variables needed
        //ask questions for the input
        System.out.println("Enter the length of the rectangle: ");
        int rLength = in.nextInt();
        System.out.println("Enter the width of the rectangle");
        int rWidth = in.nextInt();

        //math part of the program :D
        int rArea = rLength * rWidth;

        int rPerimeter = (rLength*2) + (rWidth*2);

        //printing out the math part now :)

        System.out.printf("The area of the rectangle is: %s \n", rArea);

        System.out.printf("The perimeter of the rectangle is: %s", rPerimeter);

    }
}
