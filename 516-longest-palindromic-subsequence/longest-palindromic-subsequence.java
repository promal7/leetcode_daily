class Solution {
    public int lcs(String s, int[][] dp, int i, int j){
        if(j<0 || i>=s.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return 1+lcs(s, dp, i+1, j-1);
        }
        return dp[i][j]=Math.max(lcs(s, dp, i+1, j), lcs(s, dp, i, j-1));
    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return lcs(s, dp, 0, n-1);
        
        
    }
}