package Basics;

public class Vidushi {
    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Vidushi checkTeen = new Vidushi();
        boolean result = checkTeen.hasTeen(20, 19, 22);
        System.out.println("Result = " + result);
    }
}
