import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {



    @Test
    void TestOne() {
        Fibonacci fib = new Fibonacci();
        assertEquals(fib.number(1), 100);
    }

}