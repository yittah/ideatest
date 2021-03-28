import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldReturn1when1plus1(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, '+');
        int expectResult = 2;
        Assert.assertEquals(expectResult,actualResult);
    }

    @Test
    public void shouldReturn0when1sub1(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, '-');
        int expectResult = 0;
        Assert.assertEquals(expectResult,actualResult);
    }

}