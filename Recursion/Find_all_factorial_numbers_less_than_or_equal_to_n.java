class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        calculateFactorialNumbers(n, 1, 1, result);
        return result;
    }

    private static void calculateFactorialNumbers(long n, long current, long factorial, ArrayList<Long> result) {
        if (factorial > n) {
            return;
        }
        result.add(factorial);
        calculateFactorialNumbers(n, current + 1, factorial * (current + 1), result);
    }
}