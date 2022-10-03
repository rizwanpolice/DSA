package Arrays.MixedProblems;

/*

You have been given stock values/prices for N number of days.  Every i-th day signifies the price of a stock on that day.
Your task is to find the maximum profit which you can make by buying and selling the stocks.

You may make as many transactions as you want but can not have more than one transaction at a time
i.e, if you have the stock, you need to sell it first, and then only you can buy it again.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381887?leftPanelTab=0

Solution link: https://www.youtube.com/watch?v=HWJ9kIPpzXs

TODO: This is only one variation of buy and sell stocks. There are multiple other versions like only K transactinos allowed
TODO: Max one transaction allowed, infinite transactions allowed but with transaction fee
 */
public class BestTimeToBuyAndSellStock {

    public static long getMaximumProfit (int n, long[] values) {
        if(n==0 || n==1){
            return 0;
        }

        long sum=0;
        int buy=0,sell=0;

        for(int i=0;i<n-1;i++){
            if(values[i]<=values[i+1]){
                sell = i+1;
            }else if(values[i]>values[i+1]){
                sum += (values[sell] - values[buy]);
                buy=i+1;
                sell=i+1;
            }
        }

        sum += (values[sell] - values[buy]);
        return sum;
    }
}
