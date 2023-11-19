import java.util.Random;

public class Task2 {
    public static void main(String args[]) {
        Random rand = new Random();

        int nums[] = new int[25];
        nums[0] = rand.nextInt(100);

        for (int i = 1; i < 25; i++) {
            nums[i] = rand.nextInt(100);

            if (nums[i] > nums[0])
                System.out.println("Generated number is bigger then first: " + nums[i]);
            else if (nums[i] < nums[0])
                System.out.println("Generater number smaller then first: " + nums[i]);
            else
                System.out.println("Generated number is equal to first");
        }
    }
}