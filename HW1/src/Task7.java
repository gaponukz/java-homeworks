public class Task7 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String userName = args[0];
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("Please provide your name as a command-line argument.");
        }
    }
}
