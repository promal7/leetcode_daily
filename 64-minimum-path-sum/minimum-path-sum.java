class Solution {
    public int minpath(int i, int j, int n, int m,int[][] grid, int[][] dp){
        if(i<0 || j<0) return (int) 1e9;
        if(i==0 && j==0) return grid[0][0];
        if(dp[i][j]!=-1) return dp[i][j];
        int up=grid[i][j]+minpath(i-1, j, n, m,grid, dp);
        int left=grid[i][j]+minpath(i, j-1, n, m,grid, dp);
        return dp[i][j]=Math.min(up, left);
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int[] row: dp) Arrays.fill(row,-1);
        return minpath(n-1,m-1,n,m,grid, dp);
    }
}