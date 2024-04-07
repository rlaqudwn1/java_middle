package enumeration.ref3;
// ref2-> ref3으로 리팩토링
// DisCdountSerice 클래스의 압축과 코드 압축
public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] values = Grade.values(); //Grade.values() 를 사용하면 Grade 의 모든 열거형 상수를 배열로 구할 수 있다.
        for (Grade grade : values) {
            printDiscount(grade,price);
        }
    }
    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 금액" + grade.discount(price));
    }
}
