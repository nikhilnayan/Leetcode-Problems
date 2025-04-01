/*
 * @lc app=leetcode id=718 lang=java
 *
 * [718] Maximum Length of Repeated Subarray
 */

// @lc code=start
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int maxLength = 0;

        for(int i=0 ;i <nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                int k=0;
                while (i+k<nums1.length && j+k<nums2.length && nums1[i+k]==nums2[j+k]) { 
                    k++;
                }
                maxLength = Math.max(maxLength, k);
            }
        }
        return maxLength;
    }
}
// @lc code=end
