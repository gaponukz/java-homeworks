import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int num_i = scanner.nextInt();

            num.add(num_i);
        }

        scanner.close();
        printArr(num);
        calcMeanStd(num);
    }

    public static void printArr(ArrayList<Integer> num) {
        System.out.print("[ ");
        for (int i = 0; i < num.size(); i++) {
            if (i == (num.size() - 1))
                System.out.print(num.get(i) + " ");
            else
                System.out.print(num.get(i) + ", ");
        }
        System.out.println("]");
    }

    public static void calcMeanStd(ArrayList<Integer> num) {
        int mean = 0;
        int std = 0;

        for(int i = 0; i < num.size(); i++) {
            mean += num.get(i);
        }
        mean = mean / num.size();
        for(int i = 0; i < num.size(); i++) {
            std += Math.pow(num.get(i) - mean, 2);
        }
        std = std / num.size();
        System.out.println("Mean: " + mean + " Deviation: " + std);
    }
}
