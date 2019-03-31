package CostCalculator;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class CostCalculatorTest {

    @Test
    public static void costTest(int length, BigDecimal expected, BigDecimal price){
        length = 0;
        expected = new BigDecimal("0.0");
        price = new BigDecimal("0.0");

        CostCalculator costCalculator = new CostCalculator(price);
        Assert.assertEquals(expected, costCalculator.calculate(length));
    }

    @Test
    public static void costTestOne(int length, BigDecimal expected, BigDecimal price){
        length = 1;
        expected = new BigDecimal("1.0");
        price = new BigDecimal("1.0");

        CostCalculator costCalculator = new CostCalculator(price);
        Assert.assertEquals(expected, costCalculator.calculate(length));
    }

    @Test
    public static void costTestTen(int length, BigDecimal expected, BigDecimal price){
        length = 10;
        expected = new BigDecimal("30.0");
        price = new BigDecimal("3.0");

        CostCalculator costCalculator = new CostCalculator(price);
        Assert.assertEquals(expected, costCalculator.calculate(length));
    }
}
