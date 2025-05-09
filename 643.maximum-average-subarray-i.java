/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum =0;

        for(int i=0; i<k; i++){
            sum = sum+nums[i];
        }

        int maxSum = sum;
        int startIndex = 0;
        int endIndex = k;
        while(endIndex<nums.length){

            sum = sum-nums[startIndex];
            startIndex++;

            sum = sum+nums[endIndex];
            endIndex++;

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum/k;
    }
}
// @lc code=end

