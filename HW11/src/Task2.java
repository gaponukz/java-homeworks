import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int min = n;
        int max = n;

        while (n != 0) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }

            num.add(n);

            System.out.print("Enter number: ");
            n = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Min: " + min + ", max: " + max);
    }
}
