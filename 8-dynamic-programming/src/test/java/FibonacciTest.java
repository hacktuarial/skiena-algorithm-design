import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fib = new Fibonacci();

    @Test
    void TestFirstFew() {
        assertEquals(fib.number(0), 0);
        assertEquals(fib.number(1), 1);
        assertEquals(fib.number(2), 1);
        assertEquals(fib.number(3), 2);
        assertEquals(fib.number(4), 3);
    }

    @Test
    void TestLarge() {
        assertEquals(fib.number(40), 102334155);
    }




}