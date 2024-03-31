package lang_.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);
        //회원A, 회원B의 처음 주소는 모두 서울

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

//        //회원B의 주소를 부산으로 변경
//        memberB.getAddress().setValue("부산"); //컴파일 오류
//        System.out.println("부산 -> memberB.address");
//        System.out.println("memberA = " + memberA);
//        System.out.println("memberB = " + memberB);
//        //A와 B의 같은 인스턴스 참조로 사이드 이펙트 발생

        //B에 새 주소 객체를 만들어서 전달해 B의 value 값을 변경해야 함
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);



    }
}
