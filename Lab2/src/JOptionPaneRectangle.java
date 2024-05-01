import javax.swing.*;
public class JOptionPaneRectangle {
    public static void main(String[] args) {
        int rLength;
        int rWidth;
        int rArea;
        int rPerimeter;

        rLength = Integer.parseInt(JOptionPane.showInputDialog("What is the lengh of the rectangle"));
        rWidth = Integer.parseInt(JOptionPane.showInputDialog("What is the width of the rectangle?"));

        rArea = rLength * rWidth;
        rPerimeter = (2*rLength) + (2*rWidth);

        JOptionPane.showMessageDialog(null,"The Area of the rectangle is: " + String.format("%s", rArea) + "\n" + "The perimeter of the rectangle is: " + String.format("%s", rPerimeter));
    }
}
