package me.korkorna.kataexamples.kata09;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutTest {

    private Map<String, Integer> pricingRules;
    private PricingRules pricingRules2;
    private Checkout checkout;

    @Before
    public void setUp() throws Exception {
        pricingRules = new HashMap<>();
        pricingRules.put("A", 50);
        pricingRules.put("B", 30);
        pricingRules.put("C", 20);
        pricingRules.put("D", 15);

        checkout = new Checkout(pricingRules);
        Checkout out = new Checkout(pricingRules2);
    }

    @Test
    public void 아무것도안살때() {
        Checkout checkout = new Checkout(pricingRules);
        checkout.scan("");
        assertThat(checkout.total()).isEqualTo(0);
    }

    @Test
    public void A살때() {
        Checkout checkout = new Checkout(pricingRules);
        checkout.scan("A");
        assertThat(checkout.total()).isEqualTo(50);
    }
}