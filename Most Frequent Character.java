class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
    HashMap<Character,Integer> map = new HashMap<>();
    for(char c : s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }
    char ans = 'z';
    int max = 0;
    for(char c : map.keySet()){
        int freq = map.get(c);
        if(freq > max  ||( freq == max && c<ans)){
            max = freq;
            ans = c;
        }
    }
    return ans;
    }
}
