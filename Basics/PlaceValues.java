package Basics;

import java.util.Scanner;

public class PlaceValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        int ones = 0, tens = 0, hundred = 0, thousand = 0, tenThousand = 0;

        if (number > 99999) {
            System.out.println("Number more than 5 digits is not allowed!");
        } else if (number < 9999) {
            System.out.println("Number less than 5 digits is not allowed!");
        } else if (10000 <= number && number <= 99999) {
            ones = (number / 1) % 10;
            tens = (number / 10) % 10;
            hundred = (number / 100) % 10;
            thousand = (number / 1000) % 10;
            tenThousand = (number / 10000) % 10;
        }

        System.out.printf("Ones: %d%n", ones);
        System.out.printf("Tens: %d%n", tens);
        System.out.printf("Hundred: %d%n", hundred);
        System.out.printf("Thousand: %d%n", thousand);
        System.out.printf("Ten Thousand: %d%n", tenThousand);
    }
}
