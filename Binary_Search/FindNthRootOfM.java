package Binary_Search;

public class FindNthRootOfM {

    public int NthRoot(int n, int m) {
        int low = 1, high = m;

        if (m == 0)
            return m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (fun(mid, n) == m) {
                return mid;
            }

            else if (fun(mid, n) < m) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    static int fun(int i, int n) {
        return (int) Math.pow(i, n);
    }
}