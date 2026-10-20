class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int initial =Integer.MAX_VALUE;
        for( int i =0;i<prices.length ;i++){
            if(prices[i]<initial){
                initial = prices[i];
            }
            profit = Math.max(prices[i]-initial , profit);
        }
        return profit;
    }
}
