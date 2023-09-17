package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Factorial {
    public static List<Long> factorialNumbers(long n) {
        ArrayList<Long> ans = new ArrayList<>();
        long fact = 1;
        long m = 2;
        while (fact <= n) {
            ans.add(fact);
            fact = fact * m;
            m += 1;
        }
        return ans;
    }
}
