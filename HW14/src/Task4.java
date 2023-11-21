import java.util.Scanner;

public class Task4 {
    public static void printMatr(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int n = scanner.nextInt();

        int matr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input a["+i+"]["+j+"]=");
                matr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        for (int i = 0; i < m; i++) {
            int s = 0;
            for (int j = 0; j < n; j++) {
                if (matr[i][j] > 0)
                    s += matr[i][j];
                else
                    s = 0;
            }
            System.out.println("In " + (i + 1) + " row, sum is: " + s);
        }

        printMatr(matr, m, n);
    }
}
