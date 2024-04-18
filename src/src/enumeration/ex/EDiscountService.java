package enumeration.ex;

public class EDiscountService {
    public static void main(String[] args) {
        int price = 10000;
        printDiscount(Grade.GOLD,price);


    }
    private static void printDiscount(Grade grade, int price) {
        System.out.println("등급:" + grade.name() + "할인받는 금액" + grade.discount(price));
    }
}
