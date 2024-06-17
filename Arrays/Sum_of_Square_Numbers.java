package Arrays;

//Using Two Pointer Approach
public class Sum_of_Square_Numbers {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);

        if (c < 0)
            return false;

        while (left <= right) {
            long sqSum = left * left + right * right;
            if (sqSum == c)
                return true;

            else if (sqSum < c)
                left++;

            else
                right--;
        }
        return false;
    }
}
