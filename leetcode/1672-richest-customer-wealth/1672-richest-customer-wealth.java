class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (max <= sum) {
                max = sum;
            }
        }

        return max;
        
    }
}