package Pattern_Questions;

//The Number Pattern
public class Pattern22 {
    public static void getNumberPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 1) - 1 - j;
                int bottom = (2 * n - 1) - 1 - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}
