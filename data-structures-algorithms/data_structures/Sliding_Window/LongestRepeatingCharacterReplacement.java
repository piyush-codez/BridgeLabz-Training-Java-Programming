package data_structures.Sliding_Window;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);

            maxFrequency = Math.max(maxFrequency, frequencyMap.get(currentChar));

            while ((right - left + 1) - maxFrequency > k) {
                char leftChar = s.charAt(left);
                frequencyMap.put(leftChar, frequencyMap.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        int result = characterReplacement(s, k);

        System.out.println("Longest Length: " + result);
    }
}