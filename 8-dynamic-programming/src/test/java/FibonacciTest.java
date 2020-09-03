import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {

    Fibonacci Fib = new Fibonacci();

    @Test
    void myFirstTest() {
        assertEquals(Fib.number(1), 1);
    }
}
