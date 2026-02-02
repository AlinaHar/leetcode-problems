package DynamicProgramming;

// LeetCode section: Dynamic Programming
// problem: Given each element represents the maximum number of steps it can do forward in array, and you start from first index, return true if yoo can reach to last index, false otherwise
// Time: O(n), Space: o(1)
public class MaximumJump {
    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > maxReach) {
                return false;
            }

            // update farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }

}
