class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0, j=0;
        int p=0, maxlen=0;
        while(i<n && j<n){
            if(nums[j]==1){
                j++;
            }else if(nums[j]==0){
                p++;
                j++;
            }
            while(p>k){
                if(nums[i]==1){
                    i++;
                }
                if(nums[i]==0){
                    i++;
                    p--;
                }
            }
            maxlen=Math.max(maxlen, j-i);

        }
        return maxlen;
    }
}