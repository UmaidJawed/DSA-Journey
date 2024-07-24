package Arrays;

import java.util.HashSet;

public class Checknumber_isHappy {

    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();

        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            n = sumSquare(n);
        }

        return n == 1;
    }

    static int sumSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}