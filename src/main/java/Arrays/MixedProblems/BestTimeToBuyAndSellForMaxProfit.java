package Arrays.MixedProblems;

/*
Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed.

Note: Stock must be bought before being sold.


Problem link: https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/?ref=ml_lbp

Solution link: https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/?ref=ml_lbp

 */
public class BestTimeToBuyAndSellForMaxProfit {
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};

        int minSoFar = prices[0];
        int res = 0;

        // Update the minimum value seen so far
        // if we see smaller
        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);

            // Update result if we get more profit
            res = Math.max(res, prices[i] - minSoFar);
        }
        System.out.println("Maximum profit is: " + res);
    }
}
