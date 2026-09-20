class Solution {
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int low=1, high=0, ans=0;
        for(int x: position){
            high=Math.max(x, high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canput(position, m, mid)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public boolean canput(int[] nums, int m, int dist){
        int cnt=1;
        int last=nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]-last>=dist){
                cnt++;
                last=nums[i];
            }
        }
        return cnt>=m;
    }
}