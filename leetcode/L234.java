package leetcode;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class leetcode.ListNode {
 * int val;
 * leetcode.ListNode next;
 * leetcode.ListNode() {}
 * leetcode.ListNode(int val) { this.val = val; }
 * leetcode.ListNode(int val, leetcode.ListNode next) { this.val = val; this.next = next; }
 * }
 */

// 234-palindrome-linked-list
class L234 {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        int len = list.size();
        for (int i = 0; i < (len / 2); i++) {

            if (list.get(i).intValue() != list.get(len - i - 1).intValue()) {
                return false;
            }
        }
        return true;
    }
}