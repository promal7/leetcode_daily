class Solution {
    public boolean canpart(int ind, int s, int[] nums, int[][] dp){
        if(ind==0) return nums[0] == s;
        if(s==0) return true;
        if(dp[ind][s]!=-1) return dp[ind][s]==1;
        boolean pick=false;
        if(nums[ind]<=s){
            pick=canpart(ind-1, s-nums[ind], nums, dp);
        }
        boolean notpick=canpart(ind-1, s, nums, dp);
        dp[ind][s] = (notpick || pick) ? 1 : 0;
        return pick || notpick;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i: nums){
            sum+=i;
        }
        if(sum%2==1) return false;
        int s=sum/2;
        int[][] dp=new int[n][s+1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return canpart(n-1, s, nums, dp);

    }
}