package DynamicProgramming;

// LeetCode section: Dynamic Programming
// problem: Given each element represents the maximum number of steps it can do forward in array, and you start from first index,
//          return the minimum mnumber of jumps required to reach to last index(it is guaranteed that the last index is reachable)
//Approcah: Decide the farthest index we can reach from each jump range
// Time: O(n), Space: o(1)

public class MinimumJumps {

    public int jump(int[] nums) {
        int jumps = 0; //Number of jumps taken so far
        int currentEnd = 0; // The end of the current reachable range (boundary of current jump)
        int farthest = 0; // the farthest index we can reach to within the range of current jump
        for (int i = 0; i < nums.length - 1; i++) {

            // Update the farthest reachable index from current position
            farthest = Math.max(farthest, i + nums[i]);

            // If we've reached the end of the current jump range,
            // we must increase number uf jumps and go to next range
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;

    }

}
