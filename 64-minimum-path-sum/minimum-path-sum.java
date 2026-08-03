class Solution {
    public int minPath(int[][] grid, int[][] dp, int i, int j){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return (int) 1e9;
        if(dp[i][j] !=-1) return dp[i][j];
        int up=grid[i][j]+minPath(grid,dp, i-1, j);
        int left=grid[i][j]+minPath(grid,dp, i, j-1);
        return dp[i][j]=Math.min(up, left);
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return minPath(grid,dp, n-1, m-1);

    }
}