class Solution {
    char firstRep(String S) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : S.toCharArray()) {
            if(map.get(c) > 1) {
                return c;
            }
        }

        return '#';
    }
}
