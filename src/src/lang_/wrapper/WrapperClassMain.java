package lang_.wrapper;
//기본적인 자바 제공 래퍼 클래스
public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에는 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); //-128~127 자주 사용하는 숫자 값 재사용, 불변
        Long aLong = Long.valueOf(100);
        Double aDouble = Double.valueOf(10.5);
        int intValue = newInteger.intValue();
        System.out.println("intValue = " + intValue);

        long longValue = aLong.longValue();
        System.out.println("비교");
        System.out.println("== "+ (newInteger == integerObj));
        System.out.println("equals "+ (newInteger.equals(integerObj))); //== 대신 equals를 써야한다
        //기본형을 래퍼클래스로 변경하는 것은 박싱이라 한다
        //intValue() 박스에 있는걸 다시 꺼내는 걸 언박싱 이라 한다
        //==비교는 equals() 사용

    }
}
