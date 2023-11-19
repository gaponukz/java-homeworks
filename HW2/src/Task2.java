import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the first integer:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();
        scanner.close();

        int digitsNum1 = String.valueOf(Math.abs(num1)).length();
        int digitsNum2 = String.valueOf(Math.abs(num2)).length();

        System.out.println("Digits in the first number: " + digitsNum1);
        System.out.println("Digits in the second number: " + digitsNum2);

        double harmonicMean = 2.0 / ((1.0 / num1) + (1.0 / num2));
        System.out.printf("Harmonic mean: %.2f\n", harmonicMean);
    }
}
