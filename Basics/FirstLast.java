package Basics;

public class FirstLast {

    public static void addFirstLast(int num) {
        int lastDigit = num % 10;
        int firstDigit = 0;
        while (num != 0) {
            firstDigit = num % 10;
            num /= 10;
        }
        System.out.println(firstDigit + lastDigit);
    }

    public static void main(String[] args) {
        addFirstLast(12345);
    }
}
