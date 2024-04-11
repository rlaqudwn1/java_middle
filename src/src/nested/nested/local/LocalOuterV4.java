package nested.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInsatanceVar = 3;

    public Printer process(int paramVar) {
        int localVar =1; //지역변수 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer{  //내부 클래스도 상속이 가능하다.
            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar=" + paramVar); //final 또는 사실상 final이 되야한다
                System.out.println("outInsatanceVar = " + outInsatanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        //printer.print();를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        // 만약 localVar를 변경한다면? 다시 캡쳐해야 하나??
        // paramVar = 20;

        return printer;
    }


    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer =localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);

        }
    }
    //지역 클래스가 접근하는 지역 변수의 값은 절대로 변경하면 안된다.




    //지역 클래스는 인스턴스를 생성할 때 지역변수를 먼저 캡처해서 인스턴스에 보관한다.
    //그리고 지역변수의 인스턴스를 통해 지역 변수에 접근하면, 실제로는 지역변수에 접근하는 것이 아니라
    //인스턴스에 있는 캡처한 캡처 변수에 접근한다


}
