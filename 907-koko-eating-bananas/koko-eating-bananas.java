class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int maxi=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0; i<n; i++){
            maxi=Math.max(maxi, piles[i]);
        }
        int low=1, high=maxi;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hours=0;
            for(int x:piles){
                hours+=(x+mid-1)/mid;
            }
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}