public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ISBN <9-digit ISBN>");
            return;
        }

        String input = args[0];

        if (input.length() != 9) {
            System.out.println("Please enter a 9-digit ISBN.");
            return;
        }

        int checksum = calculateChecksum(input);

        System.out.println("10-digit ISBN: " + input + checksum);
    }

    private static int calculateChecksum(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            sum += (i + 1) * digit;
        }

        int checksum = sum % 11;
        return (checksum == 10) ? 'X' : checksum;
    }
}
