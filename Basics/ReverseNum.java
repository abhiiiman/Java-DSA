package Basics;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here to Reverse digits:");
        int n = input.nextInt();
        input.close();
        int reverse = 0;
        int num = n;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        System.out.printf("Reverse of digits in %d = %d", n, reverse);
    }
}