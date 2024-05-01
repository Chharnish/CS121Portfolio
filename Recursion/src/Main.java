public class Main {
    public static int factor(int num) {
        if (num ==0) {
            return 1;
        }
        else{
            return num * factor(num-1);
        }
    }
    public static void main(String [] args) {
        System.out.println(factor(31));
    }
}
