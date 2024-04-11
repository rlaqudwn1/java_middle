package nested.nested.local;

public class LocalOuterV2 {
    private int outInsatanceVar = 3;

    public void process(int paramVar) {
        int localVar =1;

        class LocalPrinter implements Printer{  //내부 클래스도 상속이 가능하다.
            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInsatanceVar = " + outInsatanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
    //지역 클래스가 접근하는 지역 변수의 값은 변경하면 안된다.

}
