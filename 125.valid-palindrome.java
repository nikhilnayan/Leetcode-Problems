/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int len = str.length();

        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

