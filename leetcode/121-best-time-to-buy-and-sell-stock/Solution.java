class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        int maxPro = 0;

        for (int i = 0; i < prices.length; i++) {
            sell = Math.max(sell, prices[i] - buy);
            buy = Math.min(buy, prices[i]);
            maxPro = Math.max(maxPro, sell);
        }

        return maxPro;
    }
}