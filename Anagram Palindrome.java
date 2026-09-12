import java.util.HashMap;

class Solution {
    boolean canFormPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int odd = 0;

        for (int value : map.values()) {
            if (value % 2 != 0) {
                odd++;
            }
        }

        if (odd > 1) {
            return false;
        }

        return true;
    }
}
