class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {

        Arrays.sort(prices);

        int n = prices.length;
        int min = 0;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            min += prices[i];
            i++;
            j -= k;
        }
        int max = 0;
        i = 0;
        j = n - 1;

        while (i <= j) {
            max += prices[j];
            j--;
            i += k;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);

        return ans;
    }
}
