import java.util.Scanner;

public class Task4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.close();
        
        a = a << 1;
        while (a > 0)
        {
            a = a >> 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}