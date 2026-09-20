class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        long low=0, high=0, ans=0;
        for(int i=0; i<n; i++){
            high+=nums[i];
            low=Math.max(low, nums[i]);
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            if(cansplit(nums, k, mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int) ans;
    }
    public boolean cansplit(int[] nums, int k, long mid){
        int cnt=1;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(sum+nums[i]>mid){
                cnt++;
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        return cnt<=k;
    }
}