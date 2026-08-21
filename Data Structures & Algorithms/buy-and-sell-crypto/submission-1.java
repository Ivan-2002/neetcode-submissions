class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Track lowest price seen
        int maxProfit = 0;                  // Track maximum profit
        
        for (int price : prices) {
            // Update minimum price if we find a lower price
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if we sell at current price
            // (buying at minPrice which must be from earlier day)
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        
        return maxProfit;
    }
}