class Solution {
    public int trap(int[] height) {
        int l=0, r=height.length-1;
        int leftmax=0, rightmax=0;
        int totalwater=0;
        while(l<r){
            leftmax=Math.max( leftmax, height[l]);
            rightmax=Math.max(rightmax, height[r]);
            if(leftmax<rightmax){
                totalwater+=leftmax-height[l];
                l++;
            }else{
                totalwater+=rightmax-height[r];
                r--;
            }
        }
        return totalwater;
    }
}