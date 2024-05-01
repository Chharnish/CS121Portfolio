public class SammysMotto2 {
    public static void main(String[] args) {

        String motto = "Sammy's makes it fun in the sun.";
        for (int i = 0; i < motto.length() + 2; i++) {
            System.out.print("S");
        }
        System.out.println();
        System.out.print("S" + motto + "S");
        System.out.println();
        for (int i = 0; i < motto.length() + 2; i++) {
            System.out.print("S");
        }
    }
}

