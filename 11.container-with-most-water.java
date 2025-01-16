/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int left =0;
        int right = height.length - 1;
        while(left<right){
            int width = right - left;
            int currentArea = width * Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea,currentArea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxArea;


    }
}
// @lc code=end
