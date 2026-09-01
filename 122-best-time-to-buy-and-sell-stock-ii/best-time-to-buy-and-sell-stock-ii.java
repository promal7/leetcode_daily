class Solution {
    public long maxprof(int ind, int buy, int[] prices, int[][] dp){
        if(ind==prices.length) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        long profit=0;
        if(buy==0){
            profit=Math.max(-prices[ind]+maxprof(ind+1, 1, prices, dp), 0+maxprof(ind+1, 0, prices, dp));
        }
        else{
            profit=Math.max(prices[ind]+maxprof(ind+1, 0, prices, dp), maxprof(ind+1, 1, prices, dp));
        }
        return dp[ind][buy]=(int) profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] row: dp) Arrays.fill(row, -1);
        return (int) maxprof(0, 0, prices, dp);
    }
}