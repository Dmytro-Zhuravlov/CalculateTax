package TypeOfTax;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType{
    @Override
    public BigDecimal calculateTax(double amount) {
        return new BigDecimal(amount).multiply(new BigDecimal("0.13"));
    }
}
