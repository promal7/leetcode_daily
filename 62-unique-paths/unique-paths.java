class Solution {
    public int uniq(int i, int j, int m, int n, int[][] dp){
        if(i<0 || j<0) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=uniq(i-1, j, m, n, dp);
        int left=uniq(i, j-1, m, n, dp);
        return dp[i][j]=up+left;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] row: dp) Arrays.fill(row, -1);
        return uniq(m-1, n-1, m, n, dp);
    }
}