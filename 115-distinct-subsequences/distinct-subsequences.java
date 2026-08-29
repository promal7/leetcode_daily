class Solution {
    public int dist(int i, int j, String s, String t, int[][] dp){
        int n=s.length(), m=t.length();
        if(j==m) return 1;
        if(i==n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            int take=dist(i+1, j+1, s, t, dp);
            int nottake=dist(i+1, j, s, t, dp);
            dp[i][j]=take+nottake;
        }else{
            dp[i][j]=dist(i+1, j, s, t, dp);
        }
        return dp[i][j];
    }
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[][] dp=new int[n][m];
        for(int[] row: dp) Arrays.fill(row, -1);
        return dist(0, 0, s, t, dp);
    }
}