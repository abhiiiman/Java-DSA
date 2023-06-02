import java.util.Scanner;

public class PowerNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here:");
        int base = input.nextInt();
        System.out.println("Enter the power here:");
        int power = input.nextInt();
        input.close();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.printf("%d to the power %d = %d", base, power, result);
    }
}
