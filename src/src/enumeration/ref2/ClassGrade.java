package enumeration.ref2;

public enum ClassGrade {
    BASIC(10),GOLD(20),DIAMOND(30);

    private final int discountPercent;

    public int getDiscountPercent() {
        return discountPercent;
    }

    ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }
}
