public class Fibonacci {
    public int calculate_recursive(int n) {
        // exponential time
        if (n < 2) {
            return n;
        }
        else {
            return calculate_recursive(n-1) + calculate_recursive(n-2);
        }
    }

    public int calculate_memoized(int n) {
        // O(n) in time and space
        int[] results = new int[n+1];
        results[0] = 0;
        results[1] = 1;
        for (int i=2; i <= n; i++) {
            results[i] = results[i-1] + results[i-2];
        }
        return results[n];
    }

    public int calculate_ultimate(int n) {
        // O(n) in time, O(1) space
        int back2=0, back1=1;
        int next;
        if (n == 0) {
            return 0;
        }
        for (int i=2; i < n; i++) {
            next = back1 + back2;
            back2 = back1;
            back1 = next;

        }
        return back1 + back2;
    }
}
