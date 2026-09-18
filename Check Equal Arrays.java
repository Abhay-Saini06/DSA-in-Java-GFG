class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        HashMap <Integer,Integer> map1 = new HashMap<>();
        HashMap <Integer,Integer> map2 = new HashMap<>();
        for(int i : a){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int j : b){
            map2.put(j,map2.getOrDefault(j,0)+1);
        }
        return map1.equals(map2);
    }
}
