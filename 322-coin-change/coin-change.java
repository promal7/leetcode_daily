class Solution {
    public int countcoin(int ind,int[][] dp, int[] coins, int target){
        if(ind==0){
            if(target%coins[ind]==0) return target/coins[ind];
            else return (int) 1e9;
        }
        if(dp[ind][target]!=-1) return dp[ind][target];
        int nottake=countcoin(ind-1, dp, coins, target);
        int take=(int) 1e9;
        if(coins[ind]<=target){
            take=1+countcoin(ind, dp,coins, target-coins[ind]);
        }
        return dp[ind][target]=Math.min(take, nottake);

    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        int ans = countcoin(n - 1, dp, coins, amount);
        return ans >= 1e9 ? -1 : ans;
    }
}