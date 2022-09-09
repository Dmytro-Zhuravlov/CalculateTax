package TypeOfTax;

import java.math.BigDecimal;

public class TaxService {
    public void payOut(BigDecimal taxAmount) {
        System.out.format("Tax paid in the amount %.2f%n", taxAmount);
    }
}
