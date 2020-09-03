public class Fibonacci {
    public int calculate_recursive(int n) {
        if (n < 2) {
            return n;
        }
        else {
            return calculate_recursive(n-1) + calculate_recursive(n-2);
        }
    }

    public int calculate_memoized(int n) {
        int[] results = new int[n+1];
        results[0] = 0;
        results[1] = 1;
        for (int i=2; i <= n; i++) {
            results[i] = results[i-1] + results[i-2];
        }
        return results[n];
    }
}
