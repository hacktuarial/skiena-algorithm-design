public class Fibonacci {
    public int number(int n) {
        if (n < 2) {
            return 1;
        }
        else {
            return number(n-1) + number(n-2);
        }
    }
}
