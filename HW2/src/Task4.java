import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter coordinates of point A (two real numbers separated by a space):");
        Scanner scanner = new Scanner(System.in);
        double ax = scanner.nextDouble();
        double ay = scanner.nextDouble();

        System.out.println("Enter coordinates of point B (two real numbers separated by a space):");
        double bx = scanner.nextDouble();
        double by = scanner.nextDouble();

        System.out.println("Enter coordinates of point C (two real numbers separated by a space):");
        double cx = scanner.nextDouble();
        double cy = scanner.nextDouble();
        scanner.close();

        double sideAB = calculateDistance(ax, ay, bx, by);
        double sideBC = calculateDistance(bx, by, cx, cy);
        double sideCA = calculateDistance(cx, cy, ax, ay);

        double s = (sideAB + sideBC + sideCA) / 2;

        double area = Math.sqrt(s * (s - sideAB) * (s - sideBC) * (s - sideCA));

        System.out.println("Area of the triangle: " + area);

        System.out.println("Student: [Your Name]");
        System.out.println("Submission time: [Submission Time]");
    }

    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
