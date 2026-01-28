package Arrays;

// LeetCode section: Array problem: Two Sum
// Approach: Use a hash map to store seen numbers and their indices. For each number, check if its complement (`target - x`) already exists.
// Time: O(n), Space: O(n)

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //key-number value
        //value-index
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            // If complement was seen before, we found the pair
            if(hashmap.containsKey(complement)){
                return new int[]{hashmap.get(complement), i};
            }
            // Store current number and its index for future lookups
            hashmap.put(nums[i], i);

        }
        return new int[0];

    }
}
