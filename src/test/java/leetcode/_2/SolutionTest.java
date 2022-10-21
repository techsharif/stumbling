package leetcode._2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    public boolean linkListCheck(ListNode node, int[] result) {
        for (int j : result) {
            if (node == null) return false;
            if (node.val != j) return false;
            node = node.next;
        }

        return node == null;
    }

    public ListNode createListNode(int[] items) {
        if (items.length == 0) return null;

        ListNode root = new ListNode(items[0]);
        ListNode current = root;

        for (int i = 1; i < items.length; i++) {
            current.next = new ListNode(items[i]);
            current = current.next;
        }

        return root;
    }

    @Test
    void example1() {

        int[] l1n = new int[]{2, 4, 3};
        int[] l2n = new int[]{5, 6, 4};
        int[] answern = new int[]{7, 0, 8};

        ListNode l1 = createListNode(l1n);
        ListNode l2 = createListNode(l2n);

        ListNode answer = new Solution().addTwoNumbers(l1, l2);

        assertTrue(linkListCheck(answer, answern));

    }


    @Test
    void example2() {

        int[] l1n = new int[]{0};
        int[] l2n = new int[]{0};
        int[] answern = new int[]{0};

        ListNode l1 = createListNode(l1n);
        ListNode l2 = createListNode(l2n);

        ListNode answer = new Solution().addTwoNumbers(l1, l2);

        assertTrue(linkListCheck(answer, answern));

    }


    @Test
    void example3() {

        int[] l1n = new int[]{9, 9, 9, 9, 9, 9, 9};
        int[] l2n = new int[]{9, 9, 9, 9};
        int[] answern = new int[]{8, 9, 9, 9, 0, 0, 0, 1};

        ListNode l1 = createListNode(l1n);
        ListNode l2 = createListNode(l2n);

        ListNode answer = new Solution().addTwoNumbers(l1, l2);

        assertTrue(linkListCheck(answer, answern));

    }

    @Test
    void checkTestMethods() {
        int[] nums = new int[]{5, 4, 8};
        ListNode listNode = createListNode(nums);
        assertTrue(linkListCheck(listNode, nums));
    }


}