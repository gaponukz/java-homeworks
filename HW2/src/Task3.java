import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the first real number:");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second real number:");
        double num2 = scanner.nextDouble();
        scanner.close();

        double geometricMean = Math.sqrt(num1 * num2);
        
        System.out.printf("Geometric mean (scientific notation): %.2e\n", geometricMean);
        
        System.out.printf("Geometric mean (decimal notation): %.2f\n", geometricMean);
    }
}
