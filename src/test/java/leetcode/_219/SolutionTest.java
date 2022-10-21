package leetcode._219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void example1() {
        int[] nums = new int[]{1, 2, 3, 1};
        int k = 3;

        Boolean result = new Solution().containsNearbyDuplicate(nums, k);
        assertEquals(true, result);
    }

    @Test
    void example2() {
        int[] nums = new int[]{1, 0, 1, 1};
        int k = 1;

        Boolean result = new Solution().containsNearbyDuplicate(nums, k);
        assertEquals(true, result);
    }


    @Test
    void example3() {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        int k = 2;

        Boolean result = new Solution().containsNearbyDuplicate(nums, k);
        assertEquals(false, result);
    }


}