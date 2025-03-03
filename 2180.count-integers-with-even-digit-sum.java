/*
 * @lc app=leetcode id=2180 lang=java
 *
 * [2180] Count Integers With Even Digit Sum
 */

// @lc code=start
class Solution {
    public int countEven(int num) {

       
        int count = 0;

        

        for(int i=1; i<=num; i++){
            int sum = 0, temp = i;
            while(temp>0){
                sum = sum+temp%10;
                temp = temp/10;
            }

            if(sum%2==0){
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

