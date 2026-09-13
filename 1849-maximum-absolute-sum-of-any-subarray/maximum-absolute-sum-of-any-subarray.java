class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int sum=0, minsu=0;
        int minsum=0, maxsum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            minsu+=nums[i];
            maxsum=Math.max(sum, maxsum);
            minsum=Math.min(minsu, minsum);
            if(sum<0) sum=0;
            if(minsu>0) minsu=0;
        }
        return Math.max(Math.abs(maxsum), Math.abs(minsum));
    }
}