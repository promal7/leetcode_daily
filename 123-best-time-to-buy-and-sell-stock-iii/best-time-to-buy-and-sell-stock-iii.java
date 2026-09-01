class Solution {
    public int maxp(int i, int buy, int cap, int[] prices, int[][][] dp){
        if(i==prices.length || cap==0) return 0;
        long profit=0;
        if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];
        if(buy==0){
           profit=Math.max(-prices[i]+maxp(i+1, 1, cap, prices,dp), maxp(i+1, 0, cap, prices, dp));
        } 
        else{
            profit=Math.max(prices[i]+maxp(i+1, 0, cap-1, prices, dp), maxp(i+1, 1, cap, prices, dp));
        }
        return dp[i][buy][cap]=(int) profit;

    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n][2][3];
        for(int i=0; i<prices.length; i++){
            for(int j=0; j<2; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return maxp(0,0, 2, prices, dp);
    }
}