class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0, h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                l=mid+1;
            }
            if(nums[mid]>target){
                h=mid-1;
            }
        }
        return l;
    }
}