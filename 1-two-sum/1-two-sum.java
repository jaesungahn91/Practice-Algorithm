class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] index = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                index[0] = i;
                index[1] = hashMap.get(target - nums[i]);
                return index;
            }
            hashMap.put(nums[i], i);
        }
        return index;
    }
}