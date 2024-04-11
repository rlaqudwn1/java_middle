package nested.neste.annoymous;

import nested.nested.local.Printer;

public class AnnoymousOuter {
    private int outInsatanceVar = 3;

    public void process(int paramVar) {
        int localVar =1;

        Printer printer = new Printer() {//Printer를 상속(구현)하면서 바로 생성한다.
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInsatanceVar = " + outInsatanceVar);
            }
        };
        printer.print();
        System.out.println("printer.class= "+printer.getClass());
    }

    public static void main(String[] args) {
        AnnoymousOuter main = new AnnoymousOuter();
        main.process(2);
    }
    //지역 클래스가 접근하는 지역 변수의 값은 변경하면 안된다.

    //익명 클래스 장점
    //클래스를 별도로 정의하지 않고도 인터페이스나 추상 클래스를 즉석에서 구현할 수
    //있어 코드가 더 간결해지지만 복잡하거나 재사용이 필요한 경우 별도의 클래스를 사용하는 것이 좋다.
    //익명 클래스는 단 한번만 인스턴스를 생성할 수 있다.

}
