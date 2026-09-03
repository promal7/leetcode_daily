class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jumps=0;
        int l=0, r=0;
        for(int i=0; i<n-1; i++){
            r=Math.max(r, i+nums[i]);
            if(i==l){
                 jumps++;
            l=r;

            }
        }
        return jumps;
    }
}