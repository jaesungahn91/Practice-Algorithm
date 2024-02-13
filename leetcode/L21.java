package leetcode;


// 21. Merge Two Sorted Lists
public class L21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode crrunt = result;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                crrunt.next = list2;
                list2 = list2.next;
            } else {
                crrunt.next = list1;
                list1 = list1.next;
            }
            crrunt = crrunt.next;
        }

        if (list1 == null) {
            crrunt.next = list2;
        } else {
            crrunt.next = list1;
        }

        return result.next;
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
