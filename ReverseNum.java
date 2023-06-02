import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here to Reverse digits:");
        int n = input.nextInt();
        input.close();
        int reverse = 0;
        int num = n;
        // first iteration.
        int lastDigit = num % 10;
        reverse += lastDigit;
        num /= 10;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.printf("Reverse of digits in %d = %d", n, reverse);
    }
}