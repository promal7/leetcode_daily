class Solution {
    public int uniqpath(int ind1, int ind2, int[][] obstacleGrid, int[][] dp){
        if(ind1<0 || ind2<0 || obstacleGrid[ind1][ind2]==1) return 0;
        if(ind1==0 && ind2==0) return 1;
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        int left=uniqpath(ind1, ind2-1, obstacleGrid, dp);
        int up=uniqpath(ind1-1, ind2, obstacleGrid, dp);
        return dp[ind1][ind2]=left+up;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int[][] dp=new int[n][m];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return uniqpath(n-1, m-1, obstacleGrid, dp);
    }
}