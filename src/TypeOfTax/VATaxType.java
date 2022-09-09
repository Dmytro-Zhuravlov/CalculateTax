package TypeOfTax;

import java.math.BigDecimal;

public class VATaxType extends TaxType{
    @Override
    public BigDecimal calculateTax(double amount) {
        return new BigDecimal(amount).multiply(new BigDecimal("0.18"));
    }
}
