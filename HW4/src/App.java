import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x:");
        double x = scanner.nextDouble();
        scanner.close();

        double result = calculatePolynomial(x);

        System.out.println("Result: " + result);
    }

    private static double calculatePolynomial(double x) {
        double x9 = Math.pow(x, 9);
        double x3 = Math.pow(x, 3);

        return x9 + x3 + 1;
    }
}
