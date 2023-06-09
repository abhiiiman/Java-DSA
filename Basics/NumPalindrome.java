package Basics;

public class NumPalindrome {

    public static boolean checkPalindrome(int num) {
        int reverse = 0;
        int original = num;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return (original == reverse);
    }

    public static void main(String[] args) {
        boolean result = checkPalindrome(-121);
        System.out.println(result);
    }

}