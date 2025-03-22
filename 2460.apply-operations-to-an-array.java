/*
 * @lc app=leetcode id=2460 lang=java
 *
 * [2460] Apply Operations to an Array
 */

// @lc code=start
class Solution {
    public int[] applyOperations(int[] nums) {

        int index = 0; 

        for (int i = 0; i < nums.length; i++) {
            
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }

            
            if (nums[i] != 0) {
                nums[index++] = nums[i]; 
            }
        }

       
        while (index < nums.length) {
            nums[index++] = 0;
        }

        return nums;
    }
    }

// @lc code=end

