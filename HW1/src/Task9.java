/**
 * This class demonstrates default initialization of fields.
 * <p>
 * HTML Elements:
 * <ul>
 * <li><b>&lt;ul&gt;</b> - Unordered list</li>
 * <li><b>&lt;li&gt;</b> - List item</li>
 * <li><b>&lt;b&gt;</b> - Bold text</li>
 * </ul>
 * </p>
 */
public class Task9 {
    private int intValue;        // Default value for int is 0
    private char charValue;      // Default value for char is '\u0000' (null character)
    private String stringValue;  // Default value for String is null

    /**
     * The main method prints the default values of the fields.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Task9 demo = new Task9();
        System.out.println("int: " + demo.intValue);
        System.out.println("char: " + demo.charValue);
        System.out.println("String: " + demo.stringValue);
    }
}
