import java.lang.Math;
public class GCD {
    //forLoopGCD
    public int findGCDForLoop(int n1, int n2) {
        int gcd = 0;
        int lowest = Math.min(n1, n2);
        for (int i = 1; i < lowest; i++) {
            if (((n1 % i) == 0) && ((n2 % i)==0)) {
                gcd = i;
            }
        }
        return gcd;
    }
    public int findGCDWhileLoop(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            }
            else {
                n2 -= n1;
            }
        }
        return n1;
    }
    public int findGCDRecursively(int n1, int n2) {
        int init1;
        while (n2 != 0) {
            init1 = n2;
            n2 = n1 % n2;
            n1 = init1;
        }
        return n1;
    }
}
