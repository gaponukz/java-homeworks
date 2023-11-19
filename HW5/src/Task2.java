import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        String s1, s2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("s1=");
        s1 = scanner.next();

        System.out.print("s2=");
        s2 = scanner.next();
        scanner.close();

        if (s1.equals(s2)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}