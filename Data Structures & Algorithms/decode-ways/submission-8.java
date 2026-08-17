class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];

        dp[0] = 1;  // empty string

        for (int i = 1; i <= n; i++) {
            // one-digit decode
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            // two-digit decode
            if (i >= 2) {
                int twoDigit = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');

                if (twoDigit >= 10 && twoDigit <= 26) {
                    dp[i] += dp[i - 2];
                }
            }
        }

        return dp[n];
    }
}