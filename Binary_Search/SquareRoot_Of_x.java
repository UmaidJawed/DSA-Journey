package Binary_Search;

public class SquareRoot_Of_x {
    public int mySqrt(int x) {
        long low = 1, high = x;
        long result = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == x)
                return (int) mid;

            else if (mid * mid <= x) {
                low = mid + 1;
                result = mid;
            }

            else {
                high = mid - 1;
            }
        }

        return (int) result;
    }
}
