import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Task5 {
    public static void main(String args[]) {
        Map<Integer, Integer> dict= new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int prev = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int num = scanner.nextInt();

            if (containKey(dict, num)) {
                if (num == prev) {
                    dict.put(num, dict.get(num) + 1);
                }
            }
            else {
                dict.put(num, 1);
            }                

            prev = num;
        }

        scanner.close();
        
        int max_v = 0;
        int max_k = 0;

        for (int el : dict.keySet()) {
            if (dict.get(el) > max_v) {
                max_v = dict.get(el);
                max_k = el;
            }
        }

        System.out.println("Result: " + max_v + " a series of numbers: " + max_k);
    }

    public static Boolean containKey(Map<Integer, Integer> dict, int num) {
        return dict.get(num) != null;
    }
}
