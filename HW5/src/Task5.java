public class Task5 {
    public static void main(String args[]) {
        char c = 'A';
        String binaryString = Integer.toBinaryString(c);

        while (binaryString.length() < 8) {
            binaryString = "0" + binaryString;
        }

        System.out.println(binaryString);
    }
}