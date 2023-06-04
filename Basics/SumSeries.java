package Basics;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here to generate the sum of series:");
        int n = input.nextInt();
        input.close();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i; // -1,-2
            } else {
                sum += i; // 1,2,3
            }
        }
        System.out.printf("The sum of series of No. %d = %d", n, sum); // 5, 3
    }
}