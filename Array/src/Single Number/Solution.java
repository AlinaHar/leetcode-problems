// LeetCode 136 - Single Number
// Approach: Bit Manipulation (XOR)
// Time: O(n), Space: O(1)

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums){
            result = result ^ num;

        }
        return result;
    }
}