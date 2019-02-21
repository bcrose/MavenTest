import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class factorialTests {
    @Test
    void testFact3() {
        Assertions.assertEquals(6,FactorialFunction.factorial(3));
    }
}
