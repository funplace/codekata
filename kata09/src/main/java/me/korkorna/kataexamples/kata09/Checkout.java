package me.korkorna.kataexamples.kata09;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
*   Item   Unit      Special
     Price     Price
--------------------------
A     50       3 for 130
B     30       2 for 45
C     20
D     15
* */
public class Checkout {
    private Map<String, Integer> pricingRules;
    private PricingRules pricingRules2;
    private List<String> checkoutList;

    public Checkout(Map<String, Integer> pricingRules) {
        this.pricingRules = pricingRules;
        this.checkoutList = new ArrayList<>();
    }

    public Checkout(PricingRules pricingRules2) {
        this.pricingRules2 = pricingRules2;
    }

    public void scan(String item) {
        if (item != null) checkoutList.add(item);
    }

    public int total() {
        int total = 0;
        for (int i = 0; i < checkoutList.size(); i++) {
            total += pricingRules.get(checkoutList.get(i));
        }
        return total;
    }
}
