import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here to count digits:");
        int n = input.nextInt();
        input.close();
        int counter = 0;
        int num = n;
        while (num > 0) {
            num /= 10;
            counter += 1;
        }
        System.out.printf("No.of digits in %d = %d", n, counter);
    }
}