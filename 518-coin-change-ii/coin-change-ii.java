class Solution {
    public int changes(int ind, int n, int amount, int[] coins, int[][] dp){
        if(ind==0 ) return amount%coins[ind]==0?1:0;
        if(ind<0) return 0;
        if(dp[ind][amount]!=-1) return dp[ind][amount];
        int notpick=changes(ind-1, n, amount, coins, dp);
        int pick=0;
        if(coins[ind]<=amount){
            pick=changes(ind, n, amount-coins[ind], coins, dp);
        }
        return dp[ind][amount]=pick+notpick;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return changes(n-1, n, amount, coins, dp);
    }
}