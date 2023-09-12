package Basic_Mathematics_Problem;

import java.util.Scanner;

public class SumOfDivisor {
    public static int sumOfAllDivisors(int n) {
        int sum = 0;
        // n = Math.abs(n);
        for (int i = 1; i <= n; i++) {
            sum += (n / i) * i;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfAllDivisors(n));
    }

}
