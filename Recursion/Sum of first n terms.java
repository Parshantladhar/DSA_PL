class Solution {
    long sumOfSeries(long n) {
        // code here
        if (n == 0) {
            return 0;
        } else {
            return (n * n * n) + sumOfSeries(n - 1);
        }
    }
}