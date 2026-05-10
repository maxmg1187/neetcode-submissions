class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int max = 0;

        //while the selling date is still within bounds
        while(r < prices.length) {
            //if the price we buy at is less than the current selling price, lets save it as our most profit
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                max = Math.max(max, profit);
            }
            //if not, we know we can buy at a smaller price 
            else{
                l = r;
            }
            //consider the next selling day
            r++;
        }
        return max;
    }
}
