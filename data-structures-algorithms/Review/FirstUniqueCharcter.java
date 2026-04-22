package Review;

import java.util.HashMap;

class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter obj = new FirstUniqueCharacter();

        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println(obj.firstUniqChar(s1)); // 0
        System.out.println(obj.firstUniqChar(s2)); // 2
        System.out.println(obj.firstUniqChar(s3)); // -1
    }
}