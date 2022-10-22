package leetcode._3;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int mx = 0;
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start += 1;
            } else {
                set.add(s.charAt(end));
                end += 1;
                mx = Math.max(mx, end - start);
            }
        }

        return mx;
    }
}
