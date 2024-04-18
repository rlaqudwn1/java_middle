package enumeration.ex;

public enum Grade {
    BASIC(0),
    GOLD(10),
    DIAMOND(20);
    final private int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent=discountPercent;
    }
    public int discount(int price) {
        return discountPercent*price/100;
    }
}
