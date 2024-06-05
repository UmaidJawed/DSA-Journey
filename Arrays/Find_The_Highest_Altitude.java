package Arrays;

public class Find_The_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int altitude[] = new int[gain.length + 1];
        altitude[0] = 0;
        int sum = 0;
        int max = 0;

        for (int i = 1; i < altitude.length; i++) {
            altitude[i] = gain[i - 1];
        }

        for (int i = 0; i < altitude.length; i++) {
            sum = sum + altitude[i];
            max = Math.max(max, sum);
        }

        return max;
    }
}
