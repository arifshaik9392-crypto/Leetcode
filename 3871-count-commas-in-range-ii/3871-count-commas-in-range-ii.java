class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        long start = 1000;
        long commasCount = 1;

        while (start <= n) {
            long end = Math.min(n, (start * 1000) - 1);
            totalCommas += (end - start + 1) * commasCount;
            start *= 1000;
            commasCount++;
        }

        return totalCommas;
    }
}