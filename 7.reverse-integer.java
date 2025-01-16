/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int reverse = 0;

        while (x != 0) {
            int remainder = x % 10;
            if(reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10){
                return 0;
            }
            reverse = reverse * 10 + remainder;
            x=x/10;
        }
        return reverse;

    }
}
// @lc code=end
