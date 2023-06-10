package Basics;

public class GcdHcf {
    public static int checkGCD(int n1, int n2) {
        int gcd = 0;
        if (n1 > n2) {
            for (int i = 1; i < n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
        }
        for (int i = 1; i < n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(checkGCD(9, 12));
    }
}