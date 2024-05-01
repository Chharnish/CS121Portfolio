import java.util.*;
public class Rectangle {
    //scanner classsss
    static Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
        int length = getLength();
        int width = getWidth();
        int area = getArea(length, width);
        displayData(area, length, width);
    }
    public static int getLength() {
        System.out.print("Please input the length of the rectangle: ");
        int length = input.nextInt();
        return length;
    }
    public static int getWidth() {
        System.out.print("Please input the width of the rectangle: ");
        int width = input.nextInt() ;
        return width;
    }
    public static int getArea(int length, int width) {
        int area = length * width;
        return area;
    }
    public static void displayData(int area, int length, int width) {
        System.out.printf("Rectangle length: %d \nRectangle width: %d\n", length, width);
        System.out.printf("Rectangle area: %d", area);
    }


}
