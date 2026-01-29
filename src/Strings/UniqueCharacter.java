package Strings;

// LeetCode section: Strings problem: Find the first unique character in a given String and return its index if exists, -1 otherwise
// Approach: Use HasMap to store character as Key and frequency of that character as Value, iterate twice: 1 - to count frequency 2 - to find the one with frequency=1
// Time: O(n), Space: O(n)

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        //count frequency for each character
        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        //return the character for which frequency is 1
        for (char c : s.toCharArray()) {
            if (hashMap.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
