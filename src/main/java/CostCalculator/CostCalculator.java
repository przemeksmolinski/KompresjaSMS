package CostCalculator;

import java.math.BigDecimal;

public class CostCalculator {

    private BigDecimal unitPrice;

    public CostCalculator(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal calculate(int length){
        return unitPrice.multiply(new BigDecimal(length));
    }
}
