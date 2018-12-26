package me.korkorna.kataexamples.kata09;

public enum PricingRules {
    A(50),
    B(30),
    C(20),
    D(15);

    private int unitPrice;

    PricingRules(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
}
