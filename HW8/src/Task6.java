import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        int median = calculateMedian(numbers);
        System.out.println("Median: " + median);
    }

    public static int calculateMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[2];
    }
}
