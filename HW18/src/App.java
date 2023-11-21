import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input k: ");
        int k = scanner.nextInt();
        ArrayList<RatioNumber> arr = new ArrayList<RatioNumber>(k);

        for (int i = 0; i < k; i++) {
            System.out.println("Input m,n: ");
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            RatioNumber r = new RatioNumber(m, n);
            arr.add(r);
        }

        for (int i = 0; i < k - 1; i++) {
            RatioNumber n_r = arr.get(i).plus(arr.get(i + 1));
            arr.set(i, n_r);
        }

        System.out.print("Input degree of 1 polinom: ");
        k = scanner.nextInt();

        ArrayList<RatioNumber> fillArr = new ArrayList<RatioNumber>(k);
        for (int i = 0; i < k; i++) {

            System.out.print("Input m: ");
            int m = scanner.nextInt();

            System.out.print("Input n: ");
            int n = scanner.nextInt();

            RatioNumber r = new RatioNumber(m, n);

            fillArr.add(r);
        }

        Polinom p1 = new Polinom(fillArr, k);

        System.out.print("Input degree of 2 polinom: ");
        k = scanner.nextInt();

        ArrayList<RatioNumber> fillArr1 = new ArrayList<RatioNumber>(k);
        for (int i = 0; i < k; i++) {

            System.out.print("Input m: ");
            int m = scanner.nextInt();

            System.out.print("Input n: ");
            int n = scanner.nextInt();

            RatioNumber r = new RatioNumber(m, n);

            fillArr1.add(r);
        }

        scanner.close();

        Polinom p2 = new Polinom(fillArr1, k);

        Polinom p3 = p1.plus(p2);

        p3.print();
    }
}