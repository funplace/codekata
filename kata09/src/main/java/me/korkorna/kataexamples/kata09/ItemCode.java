package me.korkorna.kataexamples.kata09;

public class ItemCode {
    private String code;

    public ItemCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemCode itemCode = (ItemCode) o;

        return code != null ? code.equals(itemCode.code) : itemCode.code == null;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}
