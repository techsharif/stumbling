package leetcode._2;

class Solution {

    public void addTwoNumbers(ListNode l1, ListNode l2, int carry, ListNode result) {
        if (l1 == null && l2 == null && carry == 0) return;

        int l1Val;
        int l2Val;

        if (l1 == null) {
            l1Val = 0;
        } else {
            l1Val = l1.val;
            l1 = l1.next;
        }

        if (l2 == null) {
            l2Val = 0;
        } else {
            l2Val = l2.val;
            l2 = l2.next;
        }

        result.next = new ListNode((l1Val + l2Val + carry) % 10);
        carry = (l1Val + l2Val + carry) / 10;
        addTwoNumbers(l1, l2, carry, result.next);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode((l1.val + l2.val) % 10);
        int carry = (l1.val + l2.val) / 10;
        addTwoNumbers(l1.next, l2.next, carry, result);

        return result;
    }

}