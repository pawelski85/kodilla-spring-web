package com.kodilla.patterns2.decorator.taxiportal;
import java.math.BigDecimal;

public abstract class AbstractTaxiOrderDecorator implements TaxiOrder {
    private final TaxiOrder taxiOrder;	     		// [1]

    protected AbstractTaxiOrderDecorator(TaxiOrder taxiOrder) {// [2]
        this.taxiOrder = taxiOrder;					// [3]
    }									            // [4]

    @Override
    public BigDecimal getCost() {					// [5]
        return taxiOrder.getCost();
    }

    @Override
    public String getDescription() {					// [6]
        return taxiOrder.getDescription();
    }
}