package Basic_Mathematics_Problem;

import java.util.Scanner;

public class Palindrome {
    public static boolean palindromeNumber(int n) {
        if (n < 0)
            return false;

        int orignal = n;
        int reverse = 0;

        while (n != 0) {
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n / 10;
        }

        if (orignal == reverse)
            return true;

        else
            return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindromeNumber(n));
    }
}
