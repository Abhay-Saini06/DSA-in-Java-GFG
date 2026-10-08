class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> set1 = new ArrayList<>();

        for (int i : arr) {
            set.add(i);
        }

        for (int i : set) {
            set1.add(i);
        }

        return set1;
    }
}
