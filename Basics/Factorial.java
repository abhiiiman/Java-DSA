package Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here to count digits:");
        int n = input.nextInt();
        input.close();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.printf("Factorial of %d = %d", n, f);
    }
}
