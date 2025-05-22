class Solution {
    static int minDeletions(String s) {
        // code here
        int n = s.length();
        int[][] dp = new int[n][n];

        // All substrings with single character are palindromes of length 1
        for (int i = 0; i < n; i++)
            dp[i][i] = 1;

        // Fill the table
        for (int cl = 2; cl <= n; cl++) { // cl = current length of substring
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (s.charAt(i) == s.charAt(j) && cl == 2)
                    dp[i][j] = 2;
                else if (s.charAt(i) == s.charAt(j))
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
            }
        }

        int lps = dp[0][n - 1];
        return n - lps; 
    }
}