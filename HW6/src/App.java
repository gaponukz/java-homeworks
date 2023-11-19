import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        scanner.close();

        int invertedNum = ~num;

        System.out.println("Binary representation of the original number: " + Integer.toBinaryString(num));
        System.out.println("Binary representation of the inverted number: " + Integer.toBinaryString(invertedNum));

        System.out.println("Decimal representation of the inverted number: " + invertedNum);
    }
}
