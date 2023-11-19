public class App {
    public static void main(String[] args) {
        for (int num = 1000; num <= 9999; num++) {
            if (isVampireNumber(num)) {
                System.out.println(num);
            }
        }
    }

    private static boolean isVampireNumber(int num) {
        String numStr = Integer.toString(num);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    int fangs1 = Integer.parseInt(numStr.substring(i, i + 1) + numStr.substring(j, j + 1));
                    int fangs2 = Integer.parseInt(numStr.replaceFirst(numStr.substring(i, i + 1), "")
                            .replaceFirst(numStr.substring(j, j + 1), ""));

                    if (fangs1 * fangs2 == num) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
