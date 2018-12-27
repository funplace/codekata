package me.korkorna.kataexamples.kata09;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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
    private Map<ItemCode, Integer> pricingRules;
    private Map<ItemCode, Integer> items;

    public Checkout(Map<ItemCode, Integer> pricingRules) {
        this.pricingRules = pricingRules;
        this.items = new HashMap();
    }

    public void scan(ItemCode itemCode) {
        if (itemCode != null) items.merge(itemCode, 1, (a, b) -> a + b);
    }

    public Money total() {
        return items.entrySet()
                .stream()
                .map(entry -> new Money(pricingRules.get(entry.getKey()) * entry.getValue()))
                .collect(Collectors.reducing((a, b) -> a.add(b)))
                .orElse(new Money(0));
    }
}
