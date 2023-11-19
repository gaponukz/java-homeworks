import java.util.Scanner;

public class Task3 {
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

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (matr[i][j] < matr[i][j+1])
                    count += 1;
                else {
                    count = 0;
                }
            }
        }

        System.out.println("The most numbers increase: " + count + 2);

        printMatr(matr, m, n);
    }   
}
