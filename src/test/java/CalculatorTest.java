import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldReturn1when1plus1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, "Add");
        int expectResult = 2;
        Assert.assertEquals(expectResult,actualResult);
    }

    @Test
    public void shouldReturn0when1sub1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, "Sub");
        int expectResult = 0;
        Assert.assertEquals(expectResult,actualResult);
    }

    @Test
    public void shouldReturn4when2multi2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(2, 2, "Multi");
        int expectResult = 4;
        Assert.assertEquals(expectResult,actualResult);
    }
}