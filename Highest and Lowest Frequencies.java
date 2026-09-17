class Solution {
    public int findDiff(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int freq : map.values()) {
            max = Math.max(max, freq);
            min = Math.min(min, freq);
        }

        return max - min;
    }
}
