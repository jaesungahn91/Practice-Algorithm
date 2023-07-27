package leetcode;

// 26. Remove Duplicates from Sorted Array
public class L26 {

    public static int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[index] = nums[i+1];
                index += 1;
            }
        }

        return index;
    }

}
