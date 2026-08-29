class Solution {
    public int uniqpath(int ind1, int ind2, int[][] dp){
        if(ind1<0 || ind2<0) return 0;
        if(ind1==0 && ind2==0) return 1;
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        int left=uniqpath(ind1, ind2-1, dp);
        int up=uniqpath(ind1-1, ind2, dp);
        return dp[ind1][ind2]=left+up;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return uniqpath(m-1, n-1, dp);
    }
}