import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
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