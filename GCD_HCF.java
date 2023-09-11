import java.util.*;

public class GCD_HCF {
    public static int calcGCD(int n, int m) {
        while (n > 0 && m > 0) {
            if (n > m)
                n = n % m;

            else
                m = m % n;
        }
        if (n == 0)
            return m;

        else
            return n;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = calcGCD(n, m);
        System.out.println(result);

    }

}