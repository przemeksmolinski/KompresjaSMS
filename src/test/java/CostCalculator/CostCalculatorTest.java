package CostCalculator;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class CostCalculatorTest {

    @Test
    public void costTest(){
        int length = 0;
        BigDecimal expected = new BigDecimal("0.0");
        BigDecimal price = new BigDecimal("0.0");

        CostCalculator costCalculator = new CostCalculator(price);
        Assert.assertEquals(expected, costCalculator.calculate(length));
    }

    @Test
    public void costTestOne(){
        int length = 1;
        BigDecimal expected = new BigDecimal("1.0");
        BigDecimal price = new BigDecimal("1.0");

        CostCalculator costCalculator = new CostCalculator(price);
        Assert.assertEquals(expected, costCalculator.calculate(length));
    }

    @Test
    public void costTestTen(){
        int length = 10;
        BigDecimal expected = new BigDecimal("30.0");
        BigDecimal price = new BigDecimal("3.0");

        CostCalculator costCalculator = new CostCalculator(price);
        Assert.assertEquals(expected, costCalculator.calculate(length));
    }
}
