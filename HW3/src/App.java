import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side a:");
        double a = scanner.nextDouble();

        System.out.println("Enter the length of side b:");
        double b = scanner.nextDouble();

        System.out.println("Enter the length of side c:");
        double c = scanner.nextDouble();
        scanner.close();

        if (a + b > c && b + c > a && c + a > b) {
            double angleA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
            double angleB = Math.acos((c * c + a * a - b * b) / (2 * c * a));
            double angleC = Math.acos((a * a + b * b - c * c) / (2 * a * b));

            double angleADegrees = Math.toDegrees(angleA);
            double angleBDegrees = Math.toDegrees(angleB);
            double angleCDegrees = Math.toDegrees(angleC);

            System.out.println("Angle A in radians: " + angleA);
            System.out.println("Angle B in radians: " + angleB);
            System.out.println("Angle C in radians: " + angleC);

            System.out.println("Angle A in degrees: " + angleADegrees);
            System.out.println("Angle B in degrees: " + angleBDegrees);
            System.out.println("Angle C in degrees: " + angleCDegrees);
        } else {
            System.out.println("Invalid side lengths. They do not form a valid triangle.");
        }
    }
}
