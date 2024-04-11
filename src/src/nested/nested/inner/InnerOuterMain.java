package nested.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();

        //어떤 내부클래스가 참조할 것인지 알수 있도록 바깥 클래스의 인스턴스 정보를 알려준다

        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        //중첩: 어떤 다른것이 내부에 위치하거나 포함하는 구조적인 관계
        //내부: 나의 내부에 있는 나를 구성하는 요소

    }
}
