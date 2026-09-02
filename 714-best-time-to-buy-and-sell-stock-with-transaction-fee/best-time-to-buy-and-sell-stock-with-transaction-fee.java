class Solution {
    public int maxp(int i, int buy, int[] prices, int fee, int[][] dp){
        if(i==prices.length) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        int profit=0;
        if(buy==0){
            profit=Math.max(-prices[i]+maxp(i+1, 1, prices, fee, dp), maxp(i+1, 0, prices, fee, dp));
        }else{
            profit=Math.max(prices[i]+maxp(i+1, 0, prices, fee,dp)-fee, maxp(i+1, 1, prices, fee, dp));
        }
        return dp[i][buy]=profit;
    }
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] row: dp) Arrays.fill(row, -1);
        return maxp(0,0, prices, fee, dp);

    }
}