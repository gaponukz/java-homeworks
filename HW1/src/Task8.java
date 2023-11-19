/**
 * This class demonstrates default initialization of fields.
 */
public class Task8 {
    private int intValue;        // Default value for int is 0
    private char charValue;      // Default value for char is '\u0000' (null character)
    private String stringValue;  // Default value for String is null

    /**
     * The main method prints the default values of the fields.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Task8 demo = new Task8();
        System.out.println("int: " + demo.intValue);
        System.out.println("char: " + demo.charValue);
        System.out.println("String: " + demo.stringValue);
    }
}
