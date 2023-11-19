import java.util.Scanner;


public class Task3 {
    public static void main(String args[]) {
        int[] nums = {0, 0, 0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        if ((nums[0] != nums[1]) & (nums[0] != nums[2]) & (nums[1] != nums[2])) {
            System.out.println("Number of different numbers: 3");
        } else if ((nums[0] == nums[1]) & (nums[0] == nums[2])) {
            System.out.println("Number of different numbers: 1");
        } else {
            System.out.println("Number of different numbers: 2");
        }
    }
}