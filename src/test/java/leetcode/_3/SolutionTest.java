package leetcode._3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void example1() {
        String s = "abcabcbb";
        int expected = 3;

        assertEquals(expected, new Solution().lengthOfLongestSubstring(s));
    }

    @Test
    void example12() {
        String s = "bbbbb";
        int expected = 1;

        assertEquals(expected, new Solution().lengthOfLongestSubstring(s));
    }

    @Test
    void example3() {
        String s = "pwwkew";
        int expected = 3;

        assertEquals(expected, new Solution().lengthOfLongestSubstring(s));
    }

}