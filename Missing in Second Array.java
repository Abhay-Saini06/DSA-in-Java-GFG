class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i : b) {
            set.add(i);
        }

        for (int i : a) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}
