class Solution {
    public boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(isPalindrome(s, i, j)==true){
                    if(j-i+1>ans.length()){
                        ans=s.substring(i, j+1);
                    }
                }
            }
        }
           
        return ans;
    }
}