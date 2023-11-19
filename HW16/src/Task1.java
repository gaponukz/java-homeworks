import java.util.Scanner;

public class Task1 {
    double x;
    double y;
    public void input(Scanner s) {
        System.out.println("Input x,y: ");
        this.x = s.nextDouble();
        this.y = s.nextDouble();
    }

    public String toString() {
        return String.format("(%f, %f)", this.x, this.y);
    }
}
