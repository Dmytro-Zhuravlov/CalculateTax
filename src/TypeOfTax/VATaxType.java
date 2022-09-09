package TypeOfTax;

import java.math.BigDecimal;

public class VATaxType extends TaxType{
    @Override
    public BigDecimal calculateTax(double amount) {
        return new BigDecimal(amount * 0.18);
    }
}
