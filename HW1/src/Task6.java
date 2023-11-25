public class Task6 {
    public static void main(String[] args) {
        double sum = 0.0;

        for (String arg : args) {
            try {
                double value = Double.parseDouble(arg);
                sum += value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument: " + arg);
            }
        }

        System.out.println("Sum of arguments: " + sum);
    }
}
