package com.trl;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    // https://leetcode.com/problems/ransom-note/

    public static boolean canConstruct(final String ransomNote, final String magazine) {
        final Map<String, Integer> ransomNoteMap = countLetters(ransomNote);
        final Map<String, Integer> magazineMap = countLetters(magazine);

        for (Map.Entry<String, Integer> entry : ransomNoteMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (!magazineMap.containsKey(key) || magazineMap.get(key) < value) {
                return false;
            }
        }

        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        int[] charCount = new int[26];

        // Count the occurrences of each character in the magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Check if the characters in the ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            int index = c - 'a';
            if (charCount[index] <= 0) {
                return false;
            }
            charCount[index]--;
        }

        return true;
    }

    public static Map<String, Integer> countLetters(String input) {
        Map<String, Integer> letterCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            String letter = String.valueOf(input.charAt(i));
            letterCountMap.put(letter, letterCountMap.getOrDefault(letter, 0) + 1);
        }

        return letterCountMap;
    }
}
