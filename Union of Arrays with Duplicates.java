class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet <Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : a) set.add(i);
        for(int i : b) set.add(i);
        for(int i : set) ans.add(i);
        return ans;
    }
}
