package Pattern_Questions;

// Alpha-Triangle Pattern
public class Pattern18 {
    public static void alphaTriangle(int n) {
        char start = (char) ((int) 'A' + n - 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char newChar = (char) ((int) start - j);
                System.out.print(newChar + " ");
            }
            System.out.println();
        }
    }
}
