package leetcode;

// 278-first-bad-version
class L278 {
    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;

//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (isBadVersion(mid)) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
        return start;
    }
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
