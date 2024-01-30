package leetcode;


// 21. Merge Two Sorted Lists
public class L21 {

    public static void main(String[] args) {
        L21 solution = new L21();
        solution.mergeTwoLists();
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
