class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(prices[i]>buyprice){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=prices[i];
            }

        }
        return maxprofit;
    }
}