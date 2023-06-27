package leetcode;

/**
 * Definition for singly-linked list.
 * public class leetcode.leetcode.ListNode {
 *     int val;
 *     leetcode.leetcode.ListNode next;
 *     leetcode.leetcode.ListNode() {}
 *     leetcode.leetcode.ListNode(int val) { this.val = val; }
 *     leetcode.leetcode.ListNode(int val, leetcode.leetcode.ListNode next) { this.val = val; this.next = next; }
 * }
 */

// 876-middle-of-the-linked-list
class L876 {
    public ListNode middleNode(ListNode head) {
        int nodeCnt = 0;
        ListNode node = head;
        while(node != null) {
            nodeCnt++;
            node = node.next;
        }
        int mid = nodeCnt/2+1;  
        node = head;
        for (int i = 1; i < mid; i++) {
            node = node.next;
        }
        return node;
    }
}
