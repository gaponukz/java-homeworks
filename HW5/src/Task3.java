public class Task3 {
    public static void main(String args[]) {
        int x1 = 0x80000000;
        int x2 = 0xAAAAAAAA;

        System.out.println(" | : " + Integer.toBinaryString(x1 | x2));
        System.out.println(" ^ : " + Integer.toBinaryString(x1 ^ x2));
        System.out.println(" ~ : " + Integer.toBinaryString(~x1));
        System.out.println(" & : " + Integer.toBinaryString(x1 & x2));
        System.out.println(" >> : " + Integer.toBinaryString(x1 >> x2));
        System.out.println(" >>> : " + Integer.toBinaryString(x1 >>> x2));
        System.out.println(" << : " + Integer.toBinaryString(x1 << x2));

    }
}