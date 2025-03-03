/*
 * @lc app=leetcode id=2161 lang=java
 *
 * [2161] Partition Array According to Given Pivot
 */

// @lc code=start
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int len = nums.length;
        int[] new_arr = new int[len];
        int left = 0;

        for(int i=0; i<len; i++){
            if(nums[i]<pivot){
                new_arr[left++] = nums[i];
            }
        }
        for(int i=0; i<len; i++){
            if(nums[i]==pivot){
                new_arr[left++] = nums[i];
            }
        }
        for(int i=0; i<len; i++){
            if(nums[i]>pivot){
                new_arr[left++] = nums[i];
            }
        }
        return new_arr;
    }
}
// @lc code=end

