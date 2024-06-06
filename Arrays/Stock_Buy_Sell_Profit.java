public class Stock_Buy_Sell_Profit {
    // Using Kadane's Algorithm
    public int maxProfit(int[] prices) {
        int purchase = prices[0];
        int profit = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            if (prices[i] < purchase) {
                purchase = prices[i];
            }

            else {
                int sell = prices[i] - purchase;
                profit = Math.max(sell, profit);
            }
        }

        return profit;
    }
}
