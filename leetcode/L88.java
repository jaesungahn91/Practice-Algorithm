package leetcode;

import java.util.Arrays;

// 88. Merge Sorted Array
public class L88 {

    public static void main(String[] args) {
        System.out.println();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

}
