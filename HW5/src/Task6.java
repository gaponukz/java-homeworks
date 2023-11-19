import java.util.Scanner;


public class Task6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = scanner.nextInt();

        System.out.print("Enter number of bit m: ");
        int m = scanner.nextInt();

        System.out.println(modifyBit(n, m, getNthValueBit(n, m)));

        scanner.close();
    }

    public static int modifyBit(int n, int p, int b)
    {
        int mask = 1 << p;
        return ((n & ~mask) | (b << p));
    }

    public static int getNthValueBit(int n, int m) {
        return ((n >> (m-1)) & 1);
    }
}