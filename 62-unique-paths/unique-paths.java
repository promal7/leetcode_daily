class Solution {
    public int uniqp(int[][] dp, int i, int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int left=uniqp(dp, i, j-1 );
        int up=uniqp(dp, i-1, j);
        return dp[i][j]=left+up;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return uniqp(dp, m-1, n-1);

    }
}