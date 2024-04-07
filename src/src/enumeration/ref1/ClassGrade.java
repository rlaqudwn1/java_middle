package enumeration.ref1;

//타입 안전 열거형 패턴 enum을 사용하면 나열한 항목만 사용할 수 있게 제한을 걸 수있다
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private  final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
