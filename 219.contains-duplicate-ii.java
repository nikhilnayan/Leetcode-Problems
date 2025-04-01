/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                int prevIndex = map.get(nums[i]);
                if(i - prevIndex <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
// @lc code=end

