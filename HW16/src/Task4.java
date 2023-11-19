public class Task4 {
    public int publicField = 1;
    private int privateField = 2;
    protected int protectedField = 3;
    int packagePrivateField = 4;

    public void publicMethod() {
        System.out.println("This is public method.");
    }
    private void privateMethod() {
        System.out.println("This is private method.");
    }
    protected void protectedMethod() {
        System.out.println("This is protected method.");
    }
    void packagePrivateMethod() {
        System.out.println("This is package private method.");
    }   
}
