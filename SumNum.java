import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here to sum digits:");
        int n = input.nextInt();
        input.close();
        int sum = 0;
        int num = n;
        while (num > 0) {
            int lastDigit = num%10;
            sum += lastDigit;
            num /= 10;
            
        }
        System.out.printf("sum of digits in %d = %d", n, sum);
    }
}