class Solution {
    public int minpath(int ind1, int ind2, int[][] dp, int[][] grid){
        if(ind1==0 && ind2==0) return grid[0][0];
        if(ind1<0 || ind2<0) return (int) 1e9;
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        int left=grid[ind1][ind2]+minpath(ind1, ind2-1, dp, grid);
        int up=grid[ind1][ind2]+minpath(ind1-1, ind2, dp, grid);
        return dp[ind1][ind2]=Math.min(left, up);
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return minpath(n-1, m-1,dp, grid);
    }
}