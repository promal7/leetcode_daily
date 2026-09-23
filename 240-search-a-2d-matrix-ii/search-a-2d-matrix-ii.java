class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length, n=matrix[0].length;
        int c=n-1;
        int r=0;
        while(r<m && c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                c-=1;
            }else{
                r+=1;
            }
        }
        return false;

    }
}