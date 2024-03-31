package lang_.immutable.address;

public class RefMain_2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress c = new ImmutableAddress("대구");
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조 값 대입을 막을 수 있는 방법은 없다.
        System.out.println("b = " + b);
        System.out.println("a= "+a);
        //b.setvalue("부산"); // b의 value값을 변경해야 하나 불변객체이므로 컴파일 오류발생
        b= new ImmutableAddress("부산"); // b 새 인스턴스를 생성하여 b에 대입한다
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        //불변이라는 제약을 사용하여 사이드 이펙트 문제를 예방할 수 있다
        //적절한 제약을 거는
        // 가변(바뀔 수 있음) 불변(바꿀 수 없음)

    }
}
