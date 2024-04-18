package enumeration.ex;

public class EnumGrade {
    public static void main(String[] args) {
        Grade[] values = Grade.values();
        for (Grade value : values) {
            printDiscount(value,10000);
        }
    }
    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 금액" + grade.discount(price));
    }
}
