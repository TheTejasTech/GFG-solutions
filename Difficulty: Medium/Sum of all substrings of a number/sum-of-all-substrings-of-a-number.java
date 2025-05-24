class Solution {
    public static int sumSubstrings(String s) {
        // code here
        int n = s.length();
        int totalSum = s.charAt(0) - '0';
        int prev = totalSum;

        for (int i = 1; i < n; i++) {
            int num = s.charAt(i) - '0';
            int curr = prev * 10 + num * (i + 1);
            totalSum += curr;
            prev = curr;
        }

        return totalSum;
    }
}