package Pattern_Questions;

//Alpha-Hill Pattern
import java.util.Scanner;

public class Pattern17 {
    public static void alphaHill(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // characters
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch + " ");

                if (j <= breakpoint)
                    ch++;

                else
                    ch--;
            }

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        alphaHill(n);
    }
}
