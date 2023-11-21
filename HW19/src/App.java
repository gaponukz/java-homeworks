import java.util.ArrayList;
import java.util.List;

class Circle {
    private double radius;
    private double x;
    private double y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

public class App {
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(3, 1, 2),
                new Circle(5, 3, 4),
                new Circle(2, 0, 0),
                new Circle(4, 2, 2),
                new Circle(6, 4, 6)
        };

        List<List<Circle>> circleGroups = findCircleGroups(circles);

        System.out.println("Circle Groups:");
        for (List<Circle> group : circleGroups) {
            System.out.println(group);
        }

        Circle largestCircle = findLargestCircle(circles);
        Circle smallestCircle = findSmallestCircle(circles);

        System.out.println("\nLargest Circle: " + largestCircle);
        System.out.println("Smallest Circle: " + smallestCircle);
    }

    private static List<List<Circle>> findCircleGroups(Circle[] circles) {
        List<List<Circle>> circleGroups = new ArrayList<>();
        List<Circle> visited = new ArrayList<>();

        for (Circle circle : circles) {
            if (!visited.contains(circle)) {
                List<Circle> group = new ArrayList<>();
                group.add(circle);

                for (Circle other : circles) {
                    if (!circle.equals(other) && areCentersOnSameLine(circle, other) && !visited.contains(other)) {
                        group.add(other);
                        visited.add(other);
                    }
                }

                circleGroups.add(group);
            }
        }

        return circleGroups;
    }

    private static boolean areCentersOnSameLine(Circle circle1, Circle circle2) {
        return circle1.getX() * (circle1.getY() - circle2.getY()) +
               circle2.getX() * (circle2.getY() - circle1.getY()) +
               2 * (circle2.getX() * circle1.getY() - circle1.getX() * circle2.getY()) == 0;
    }

    private static Circle findLargestCircle(Circle[] circles) {
        Circle largestCircle = circles[0];

        for (Circle circle : circles) {
            if (circle.calculateArea() > largestCircle.calculateArea()) {
                largestCircle = circle;
            }
        }

        return largestCircle;
    }

    private static Circle findSmallestCircle(Circle[] circles) {
        Circle smallestCircle = circles[0];

        for (Circle circle : circles) {
            if (circle.calculateArea() < smallestCircle.calculateArea()) {
                smallestCircle = circle;
            }
        }

        return smallestCircle;
    }
}
