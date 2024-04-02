package lang_.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();                //adder 인스턴스 생성
        int result = adder.add(1).add(2).add(3).getValue(); //add()의메서드를 호출하면 자신의 참조값이 반환되는데
                                                            // 이 참조값을 즉시 사용해 메서드를 호출할 수 있다.
                                                            // 이 방법으로 메서드 호출을 체인처럼 이어나가는 것이 메서드 체이닝이다.
                                                            // 메서드가 끝나는 시점에 바로.을 사용하기 때문에 변수명을 생략할 수 있다.

        System.out.println("result = " + result);



    }
}
