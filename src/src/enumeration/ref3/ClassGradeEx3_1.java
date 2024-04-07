package enumeration.ref3;
// ref2-> ref3으로 리팩토링
// DisCdountSerice 클래스의 압축과 코드 압축
public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        printDiscount(Grade.BASIC,price);
        printDiscount(Grade.GOLD,price);
        printDiscount(Grade.DIAMOND,price);

    }
    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 금액" + grade.discount(price));
    }
}
