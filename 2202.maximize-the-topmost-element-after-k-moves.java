/*
 * @lc app=leetcode id=2202 lang=java
 *
 * [2202] Maximize the Topmost Element After K Moves
 */

// @lc code=start
class Solution {
    public int maximumTop(int[] nums, int k) {

        int n = nums.length;

        if (n == 1 && k % 2 == 1) {
            return -1;
        }

        int max = 0;
        for (int i = 0; i < Math.min(n, k - 1); i++) {
            max = Math.max(max, nums[i]);
        }

        if (k < n) {
            return Math.max(max, nums[k]);
        } else {
            return max;
        }
    }
}
// @lc code=end
