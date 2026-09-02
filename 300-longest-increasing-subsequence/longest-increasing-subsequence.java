class Solution {
    public int longs(int i, int prev_ind, int[] nums, int[][] dp){
        if(i==nums.length) return 0;
        if(dp[i][prev_ind+1]!=-1) return dp[i][prev_ind+1];
        int take=Integer.MIN_VALUE;
        int nottake=longs(i+1, prev_ind, nums, dp);
        if(prev_ind==-1 || nums[i]>nums[prev_ind]){
            take=1+longs(i+1, i, nums, dp);
        }
        return dp[i][prev_ind+1]=Math.max(take, nottake);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] row: dp) Arrays.fill(row, -1);
        return longs(0,-1,nums, dp);

    }
}