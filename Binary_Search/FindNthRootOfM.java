package Binary_Search;

public class FindNthRootOfM {

    public int NthRoot(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midN = fun(mid, n, m);

            if (midN == 1) {
                return mid;
            }

            else if (midN == 0) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    /*
     * Using this approach inorder to avoid Overflow of the data:
     * return 0 if < m
     * return 1 if = m
     * return 2 if > m
     */

    static int fun(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m)
                return 2;
        }
        if (ans == m)
            return 1;

        return 0;
    }
}