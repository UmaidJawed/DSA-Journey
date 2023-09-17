package Recursion;

import java.util.Scanner;

public class Sum_Of_Natural_Numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        sum = (n * (n + 1)) / 2;
        System.out.println(sum);
    }
}
