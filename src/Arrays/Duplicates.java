package Arrays;

// LeetCode section: Array problem: Remove array duplicates in place and return the size of the new array
// Approach: Use a two pointer pattern
// Time: O(n), Space: O(1)

public class Duplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i = 0; //slow pointer
        for (int j = 1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;

    }
}
