import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fib = new Fibonacci();

    @Test
    void TestFirstFew() {
        assertEquals(0, fib.calculate_recursive(0));
        assertEquals(1, fib.calculate_recursive(1));
        assertEquals(1, fib.calculate_recursive(2));
        assertEquals(2, fib.calculate_recursive(3));
        assertEquals(3, fib.calculate_recursive(4));
    }

    @Test
    void TestLargeRecursive() {
        assertEquals(102334155, fib.calculate_recursive(40));
    }

    @Test
    void TestLargeMemoized() {
        assertEquals(102334155, fib.calculate_memoized(40));
    }

    @Test
    void TestLargeUltimate() {
        assertEquals(102334155, fib.calculate_ultimate(40));
    }




}