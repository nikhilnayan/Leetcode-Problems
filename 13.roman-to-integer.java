/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {

        int len = s.length();
        int num = 0;

        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i + 1 < len && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                        num -= 1;
                    } else {
                        num += 1;
                    }
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if (i + 1 < len && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                        num -= 10;
                    } else {
                        num += 10;
                    }
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if (i + 1 < len && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                        num -= 100;
                    } else {
                        num += 100;
                    }
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
                default:

                    throw new IllegalArgumentException("Invalid Roman numeral character: " + s.charAt(i));
            }
        }
        return num;

    }
}
// @lc code=end
