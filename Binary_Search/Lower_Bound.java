package Binary_Search;

public class Lower_Bound {
    public static int lowerBound(int[] arr, int n, int x) {
        int low = 0;
        n = arr.length;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
