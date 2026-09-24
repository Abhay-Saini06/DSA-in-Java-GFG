import java.util.*;

class Solution {
    public int findDuplicate(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int ans = Integer.MAX_VALUE;

        for (int num : map.keySet()) {
            if (map.get(num) == k) {
                ans = Math.min(ans, num);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
