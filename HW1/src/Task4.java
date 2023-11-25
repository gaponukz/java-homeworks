public class Task4 {
    private static int instanceCount = 0;

    public Task4() {
        instanceCount++;
    }

    public static void main(String[] args) {
        Task4 obj1 = new Task4();
        Task4 obj2 = new Task4();

        System.out.println("Number of instances: " + Task4.instanceCount);
    }
}
