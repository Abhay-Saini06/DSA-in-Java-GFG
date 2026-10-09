import java.util.*;

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        Arrays.sort(arr1);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<pair> list = new ArrayList<>();

        for (int num : arr1) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                int count = map.get(complement);

                for (int i = 0; i < count; i++) {
                    list.add(new pair(num, complement));
                }
            }
        }

        return list.toArray(new pair[0]);
    }
}
