package leetcode;

// 1672-richest-customer-wealth
class L1672 {
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