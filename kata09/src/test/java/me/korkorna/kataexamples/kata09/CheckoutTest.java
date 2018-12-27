package me.korkorna.kataexamples.kata09;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutTest {

    private Map<ItemCode, Integer> pricingRules;
    private Checkout checkout;

    @Before
    public void setUp() throws Exception {
        pricingRules = new HashMap<>();
        pricingRules.put(new ItemCode("A"), 50);
        pricingRules.put(new ItemCode("B"), 30);
        pricingRules.put(new ItemCode("C"), 20);
        pricingRules.put(new ItemCode("D"), 15);

        checkout = new Checkout(pricingRules);
    }

    @Test
    public void 아무것도안살때() {
        Money expectMondy = new Money(0);
        Checkout checkout = new Checkout(pricingRules);
        checkout.scan(null);
        assertThat(checkout.total()).isEqualTo(expectMondy);
    }

    @Test
    public void A살때() {
        Money expectMondy = new Money(50);
        Checkout checkout = new Checkout(pricingRules);
        checkout.scan(new ItemCode("A"));
        assertThat(checkout.total()).isEqualTo(expectMondy);
    }
}