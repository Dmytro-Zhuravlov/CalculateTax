import TypeOfTax.*;

import java.math.BigDecimal;

public class Bill {
    private final double amount;
    private final TaxType taxType;
    private final TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        BigDecimal taxAmount;
        if(this.taxType instanceof IncomeTaxType) {
            taxAmount = this.taxType.calculateTax(this.amount);
        } else if(this.taxType instanceof VATaxType) {
            taxAmount = this.taxType.calculateTax(this.amount);
        } else {
            taxAmount = this.taxType.calculateTax(this.amount);
        }


        taxService.payOut(taxAmount);
    }

    public static void main(String[] args) {
        Bill bill = new Bill(150000, new ProgressiveTaxType(), new TaxService());
        bill.payTaxes();
    }
}
