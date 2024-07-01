package Arrays;

public class Three_Consecutive_Odds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
            if (arr[i] % 2 == 0) {
                count = 0;
            }
            if (count == 3)
                return true;
        }

        return false;
    }
}
