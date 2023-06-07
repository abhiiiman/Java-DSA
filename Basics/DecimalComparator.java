package Basics;

import java.util.Scanner;

    public class DecimalComparator{
        public boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int roundedNum1 = (int) num1*1000;
        int roundedNum2 = (int) num2*1000;
        return (roundedNum1 == roundedNum2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number here:");
        double number1 = input.nextDouble();
        System.out.println("Enter the 2nd number here:");
        double number2 = input.nextDouble();
        input.close();

        DecimalComparator checkDecimal = new DecimalComparator();
        boolean result = checkDecimal.areEqualByThreeDecimalPlaces(number1, number2);
        System.out.println(result);
    }

}
