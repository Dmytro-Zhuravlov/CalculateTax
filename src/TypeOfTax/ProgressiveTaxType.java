package TypeOfTax;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType{
    @Override
    public BigDecimal calculateTax(double amount) {
        if(amount < 100_000) {
            return new BigDecimal(amount * 0.1);
        } else {
            return new BigDecimal(amount * 0.15);
        }
    }
}
