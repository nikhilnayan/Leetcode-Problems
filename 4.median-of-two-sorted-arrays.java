/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] new_arr = new int[nums1.length+nums2.length];
        int j=0;

        for(int i=0; i<nums1.length; i++){
            new_arr[j] = nums1[i];
        }
        for(int i=0; i<nums2.length; i++){
            new_arr[j] = nums2[i];
        }

        Arrays.sort(new_arr);

        int mid = (new_arr.length-1)/2;

        if(mid%2==0){
            return (new_arr[mid]+new_arr[mid-1])/2;
        }else{
            return new_arr[mid]/2;
        }


    }
}
// @lc code=end

