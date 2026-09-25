class Solution {
    public List<Integer> getDistinct(int[] arr) {

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                int freq = map.getOrDefault(arr[i], 0);

                if (freq == 0) {
                    count++;
                }

                map.put(arr[i], freq + 1);
            }

            else {

                int value = -arr[i];

                int freq = map.getOrDefault(value, 0);

                if (freq > 0) {

                    map.put(value, freq - 1);

                    if (freq == 1) {
                        count--;
                    }
                }
            }

            ans.add(count);
        }

        return ans;
    }
}
