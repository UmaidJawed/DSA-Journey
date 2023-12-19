package Pattern_Questions;

//Symmetric-Void Pattern
import java.util.Scanner;

public class Pattern19 {
    public static void symmetry(int n) {
        int iniS = 2 * n - 2;

        // Upper half of the pattern
        for (int i = 0; i < n; i++) {
            // Print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            // Print spaces
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            // Adjust the number of spaces for the next row
            iniS -= 2;

            // Move to the next line
            System.out.println();
        }

        iniS = 0;

        // Lower half of the pattern
        for (int i = 0; i < n; i++) {
            // Print stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            // Print spaces
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            // Adjust the number of spaces for the next row
            iniS += 2;

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        symmetry(n);
    }
}
