import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your last name:");

        Scanner scanner = new Scanner(System.in);
        String lastName = scanner.nextLine();
        scanner.close();

        System.out.println("Hello, " + lastName + "!");
    }
}
