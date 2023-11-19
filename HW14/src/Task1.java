import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int n = scanner.nextInt();

        int matr[][] = new int[m][n];
        int arr[] = new int[n*m];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input a["+i+"]["+j+"]=");
                int el = scanner.nextInt();
                matr[i][j] = el;
                arr[index] = el;
                index += 1;
            }
        }
        scanner.close();

        Arrays.sort(arr);
        index = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = arr[index];
                index += 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
