package enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        //존재하지 않는 등급
        int vip=discountService.discount("VIP", price);
        System.out.println("vip = " + vip);
        // 오타
        int diamindd = discountService.discount("DIAMINDD", price);
        System.out.println("diamindd = " + diamindd);

        //소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold = " + gold);
        //타입 안정성 부족: 문자열은 오타와 유효하지 않는 값을 입력할 수 있다
        //데이터 일관성 "GOLD", "gold"등 다양한 형식으로 문자열을 입력할 수 없어
        // 값의 제한 부족 으로 컴파일 오류 감지 불가

    }
}
