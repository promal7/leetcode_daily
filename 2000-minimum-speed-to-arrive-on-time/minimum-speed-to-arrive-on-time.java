class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length;
        int low=1, high=10000000;
        int speed=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            double ans=0;
            for(int i=0; i<n; i++){
                if(i==n-1){
                    ans+=(double) dist[i]/mid;
                }else{
                    ans+=(dist[i]+mid-1)/mid;
                }
            }
            if(ans<=hour){
                speed=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return speed;
    }

}