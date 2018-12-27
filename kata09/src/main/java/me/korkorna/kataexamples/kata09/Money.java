package me.korkorna.kataexamples.kata09;

public class Money {
    private int value = 0;

    public Money(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        return value == money.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    public Money add(int value) {
        return new Money(this.value + value);
    }

    public Money add(Money otherMoney) {
        return new Money(this.value + otherMoney.value);
    }
}
