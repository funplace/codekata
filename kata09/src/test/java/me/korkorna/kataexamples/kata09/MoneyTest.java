package me.korkorna.kataexamples.kata09;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MoneyTest {

    @Test
    public void 객체생성() {
        Money a = new Money(0);
        Money b = new Money(0);
        assertThat(a).isEqualTo(b);
    }

    @Test
    public void 객체비교_다름() {
        Money a = new Money(0);
        Money b = new Money(1);
        assertThat(a).isNotEqualTo(b);
    }
}