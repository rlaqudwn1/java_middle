package lang_.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();    //adder 인스턴스 생성
        ValueAdder adder1 = adder.add(1);       //adder1에 adder 참조값을 반환
        ValueAdder adder2 = adder.add(2);       //adder2에 adder1(adder)참조값을 반환
        ValueAdder adder3 = adder.add(3);       //adder3에 adder2(adder) 참조값을 반환해 adder1,2,3은 모두 adder의 참조값을 참조한다


        int reuslt= adder3.getValue();
        System.out.println("reuslt = " + reuslt);
        System.out.println("adder = " + adder);
        System.out.println("adder1 = " + adder1);
        System.out.println("adder2 = " + adder2);
        System.out.println("adder3 = " + adder3);
    }
}
