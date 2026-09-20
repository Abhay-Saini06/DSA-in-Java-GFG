class Solution {
    int countPairs(int[] arr, int k) {
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] - k)) {
                count += map.get(arr[i] - k);
            }
        }

        return count;
    }
}
