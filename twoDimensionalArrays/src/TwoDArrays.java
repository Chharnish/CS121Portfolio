public class TwoDArrays {
    public static void main(String[] args) {
        //2d arrays for integers and doubles
        int integers [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        double doubles [][] = {
                {1.1,2.2,3.3},
                {4.4,5.5,6.6},
                {7.7,8.8,9.9},
                {10.10,11.11,12.12}
        };
        String names [][] = {
                {"Jeremy", "Jackson", "Jacob"},
                {"Michael", "Peter", "Olivia"}
        };
        System.out.println("Integer 2D arrays\n=============================");
        for (int row = 0; row < integers.length; row++) {
            for (int col = 0; col < integers[row].length; col++) {
                System.out.printf("%d ", integers[row][col]);
            }
            System.out.println();
        }
        System.out.println("Double 2D arrays\n==============================");
        for (int row = 0; row < doubles.length; row++) {
            for (int col = 0; col < doubles[row].length; col++) {
                System.out.printf("%s ", doubles[row][col]);
            }
            System.out.println();
        }
        System.out.println("String 2D arrays\n==============================");
        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names[row].length; col++){
                System.out.printf("%s ", names[row][col]);
            }
            System.out.println();
        }

    }
}
