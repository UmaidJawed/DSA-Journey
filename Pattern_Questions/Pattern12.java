package Pattern_Questions;

import java.util.Scanner;

//Number Crown Pattern
public class Pattern12 {
    public static void numberCrown(int n) {
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // space
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            spaces -= 2;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberCrown(n);
    }
}
