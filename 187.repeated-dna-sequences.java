/*
 * @lc app=leetcode id=187 lang=java
 *
 * [187] Repeated DNA Sequences
 */

// @lc code=start
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int n = s.length();

        for (int i = 0; i <= n - 10; i++) {
            String sequence = s.substring(i, i + 10);
            if (seen.contains(sequence)) {
                repeated.add(sequence);
            } else {
                seen.add(sequence);
            }
        }

        return new ArrayList<>(repeated);
        
    }
}
// @lc code=end

