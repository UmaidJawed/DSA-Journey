package Arrays;

import java.util.Arrays;

public class Maximum_Profit_Assigning_Work {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int m = worker.length;
        int jobs[][] = new int[n][2];
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }

        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        Arrays.sort(worker);
        int i = 0, currProfit = 0;

        for (int skill : worker) {
            while (i < n && skill >= jobs[i][0]) {
                currProfit = Math.max(currProfit, jobs[i][1]);
                i++;
            }
            maxProfit += currProfit;
        }

        return maxProfit;
    }
}