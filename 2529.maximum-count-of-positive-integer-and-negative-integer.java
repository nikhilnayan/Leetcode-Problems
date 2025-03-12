/*
 * @lc app=leetcode id=2529 lang=java
 *
 * [2529] Maximum Count of Positive Integer and Negative Integer
 */

// @lc code=start
class Solution {
    public int maximumCount(int[] nums) {

        int plus = 0, minus = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                plus++;
            } else if (nums[i] < 0) {
                minus++;
            } else {
                count++;
            }
        }
        if(plus>=minus){
            return plus;
        }else{
            return minus;
        }

        

    }
}
// @lc code=end
