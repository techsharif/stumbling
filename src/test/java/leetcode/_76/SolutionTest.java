package leetcode._76;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void example1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        assertEquals("BANC", new Solution().minWindow(s, t));
    }

    @Test
    void example2() {
        String s = "a";
        String t = "a";

        assertEquals("a", new Solution().minWindow(s, t));
    }

    @Test
    void example3() {
        String s = "a";
        String t = "aa";

        assertEquals("", new Solution().minWindow(s, t));
    }

}