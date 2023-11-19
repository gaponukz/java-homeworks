import java.util.ArrayList;
import java.util.List;


public class Task4 {
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);

        float c = (float) a / b;
        String [] s = Float.toString(c).split("\\.");
        System.out.println("origin => " + s[0] + "." + s[1]);
        String input = s[1];

        String first_ch = Character.toString(input.charAt(0));
        List<String> list = new ArrayList<String>();
        list.add(first_ch);

        for (int i = 1; i < input.length(); i++) {
            if (Character.toString(input.charAt(i)).equals(first_ch)) {
                break;
            }
            list.add(Character.toString(input.charAt(i)));
        }

        String result = ".(";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        result += ")";

        System.out.println("result => " + s[0] + result);
    }
}