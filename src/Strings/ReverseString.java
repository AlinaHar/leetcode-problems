package Strings;

// LeetCode section: String problem: Reverse the given string(array of characters) in place
// Approach: Use a two pointer pattern
// Time: O(n), Space: O(1)

public class ReverseString {
    public void reverseString(char[] s){
        int i=0;
        //will start from the opposite direction
        for (int j = s.length-1; j>0; j--){
            if(s[i] != s[j]){
                i++;
                s[i] = s[j];
            }
        }
    }
}
