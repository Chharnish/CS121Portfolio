public class CFTable {
    public static void main(String[] args) {
        //declaring variables
        double fahrenheit = 0;
        //doing le math
        for (int c = 0; c <= 20; c++) {
            fahrenheit = (c * (9.0/5.0) + 32.0);
            System.out.println("Celsius: " + c + " Fahrenheit: " + fahrenheit);
        }

    }
}
