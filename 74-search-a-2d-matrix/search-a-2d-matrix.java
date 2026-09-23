class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int validrow = -1;

        int top = 0, bottom = n - 1;

        while(top <= bottom) {
            int mi = top + (bottom - top) / 2;

            if(target < matrix[mi][0]) {
                bottom = mi - 1;
            }
            else if(target > matrix[mi][m - 1]) {
                top = mi + 1;
            }
            else {
                validrow = mi;
                break;
            }
        }

        if(validrow == -1) return false;
        int l = 0, r = m - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(matrix[validrow][mid] == target) {
                return true;
            }
            else if(matrix[validrow][mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return false;
    }
}