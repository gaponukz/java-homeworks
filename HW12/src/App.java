import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {123, 45, 7890, 12, 4567, 89};

        int[] minDigitCountNumbers = findMinDigitCountNumbers(array);

        System.out.println("Numbers with the minimum digit count: " + Arrays.toString(minDigitCountNumbers));
    }

    private static int[] findMinDigitCountNumbers(int[] array) {
        int minDigitCount = Integer.MAX_VALUE;

        for (int num : array) {
            int digitCount = countDigits(num);
            minDigitCount = Math.min(minDigitCount, digitCount);
        }

        int count = 0;
        for (int num : array) {
            if (countDigits(num) == minDigitCount) {
                count++;
            }
        }

        int[] resultArray = new int[count];
        int index = 0;
        for (int num : array) {
            if (countDigits(num) == minDigitCount) {
                resultArray[index++] = num;
            }
        }

        return resultArray;
    }
    
    private static int countDigits(int num) {
        return Integer.toString(Math.abs(num)).length();
    }
}
