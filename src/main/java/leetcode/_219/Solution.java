package leetcode._219;

import java.util.HashMap;
import java.util.Map;

// 219. Contains Duplicate II
// https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Boolean> exist = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (exist.containsKey(nums[i])) return true;
            exist.put(nums[i], true);
            if (i >= k) {
                exist.remove(nums[i - k]);
            }

        }
        return false;

    }


}
