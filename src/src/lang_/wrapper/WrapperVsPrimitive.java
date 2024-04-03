package lang_.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 10000; // 반복횟수 10억
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime=System.currentTimeMillis();
        for (int i=0; i<iterations; i++){
            sumPrimitive+=i;
        }
        endTime=System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");
        //1752ms
        //래퍼 클래스 Long

        Long sumWrapper = 0L;
        startTime=System.currentTimeMillis();
        for (int i=0; i<iterations; i++){
            sumWrapper+=i;   //오토 박싱 발생
        }
        endTime=System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumWrapper);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");
        // 7514ms
        // 기본형 연산은 메모리에서 4byte 만큼만 공간을 차지하고
        // 래퍼클래스 인스턴스는 객체 메타데이터를 포함하므로 많은 메모리를 사용한다.

        // 일반적인 애플리케이션을 만드는 관점에선 이런 부분을 최적화해도 사막의 모래알 하나 정도의 차이가 난다
        // cpu연산을 아주 많이 수행하는 특수한 경우, 수만 수십만 이상 연속해서 연산을 수행해야 하는 경우에 기본형 사용 최적화를 고려하자
        // 일반적인 경우에는 유지보수하기 더 나은 것을 선택하면 좋다.

        // 유지보수 vs 최적화를 고려하는 상황이라면 유지보수하기 좋은 코드를 먼저 고민해야 한다 특히 최신 컴퓨터는 매우 빠르기 때문에
        // 메모리 안에서 발생하는 연산 한두개보다 네트워크 호출 한번이 많게는 수십만배 더 오래 걸린다,
        // 성능 테스트 후 정말 문제가 되는 부분을 찾아서 최적하 하는 것이 좋다.


    }
}
