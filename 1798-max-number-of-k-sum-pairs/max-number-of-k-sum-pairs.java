class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0, r=n-1;
        int cnt=0;
        while(l<r){
            if(nums[l]+nums[r]<k){
               l++;
            }else if(nums[l]+nums[r]>k){
                r--;
            }else{
                cnt++;
                l++;
                r--;
            }
        }
        return cnt;
    }
}