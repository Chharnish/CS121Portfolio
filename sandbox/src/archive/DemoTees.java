import java.util.Scanner;
public class DemoTees {
    public static void main( String [] args) {
        //defining scanner
        Scanner input = new Scanner(System.in);
        TeeShirt Shirt1 = null;
        CustomTee Shirt2 = null;
        //for loop to ask for object variables
        for (int i=0; i < 2; i++) {
            System.out.print("Please input the order number: \n");
            int orderNum = input.nextInt();
            input.nextLine();
            System.out.print("Please input your size (S, M, L, XL, XXL, XXXL): \n");
            String size = input.nextLine();
            System.out.print("Please input your color for the shirt: \n");
            String color = input.next();
            input.nextLine();
            if (i == 0) {
                Shirt1 = new TeeShirt(orderNum, size, color);
            }
            if (i == 1){
                System.out.print("Please input a slogan for your TShirt:\n");
                String slogan = input.nextLine();
                Shirt2 = new CustomTee(orderNum, size, color, slogan);
            }
            System.out.print("Next Shirt\n");

        }
        input.close();
        System.out.println(Shirt1.toString() + "\n");
        System.out.println(Shirt2.toString());
    }

}
