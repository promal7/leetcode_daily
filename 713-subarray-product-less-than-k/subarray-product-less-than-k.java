class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        if(k==0 || k==1) return 0;
        int l=0;
        int cnt=0;
        int prod=1;
        for(int r=0; r<n; r++){
            prod=prod*nums[r];
            while(prod>=k){
                prod/=nums[l];
                l++;
            }
            cnt+=r-l+1;
        }
        return cnt;
    }
}