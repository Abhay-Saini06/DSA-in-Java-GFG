
class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > first && arr[i] < second) {
                second = arr[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        if (second == Integer.MAX_VALUE) {
            result.add(-1);
        } else {
            result.add(first);
            result.add(second);
        }

        return result;
    }
}
