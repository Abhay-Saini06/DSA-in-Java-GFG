
class Solution {
    int minCost(int[] height) {
        int n = height.length;

        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {

            int firststep = dp[i - 1] +
                    Math.abs(height[i] - height[i - 1]);

            int min;

            if (i > 1) {
                int secondStep = dp[i - 2] +
                        Math.abs(height[i] - height[i - 2]);

                min = Math.min(firststep, secondStep);
            } else {
                min = firststep;
            }

            dp[i] = min;
        }

        return dp[n - 1];
    }
}
