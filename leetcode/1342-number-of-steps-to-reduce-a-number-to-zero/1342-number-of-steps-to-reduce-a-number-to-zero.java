class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            num = calculate(num);
            step++;
        }
        
        return step;
    }

    public int calculate(int num) {
        if (num%2 == 0) return num/2;
        return num-1;
    }
}