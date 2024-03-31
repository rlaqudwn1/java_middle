package lang_.immutable.address;

public class RefMain_3 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address c = new Address("진도");

        Address a = new Address("서울");
        Address b = a; //b또한 a의 인스턴스 주소를 참조하게 된다
        System.out.println("b = " + b);
        System.out.println("a= "+a);
        change(b, "부산");
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        //a와 b 모두 같은 인스턴스 주소값을 참조 해 a의 value를 출력해도 부산이 출력된다

    }
    private  static void  change(Address address, String changeAddress){
        System.out.println("주소값을 변경합니다 "+changeAddress);
        address.setValue(changeAddress);
    }
}
