package lang_.string.builder;

public class LoopStringMain_1 {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i<100000; i++){
            sb.append("hello Java");            // 객체의 생성이 생략되므로 String보다 최적화가 더 좋다

        }
        long endTime = System.currentTimeMillis();
        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time = " +(endTime-starTime)+"ms");
        // StringBuilder를 사용하는 것이 더 좋은 경우
        // 반복문에서 반복해서 문자를 연결할 때  (단 수가 많아야 고려한다)
        // 조건문을 통해 동적으로 문자열을 조합할 때
        //  복잡한 문자열의 특정 부분을 변경해야 할 때
        // 매우 긴 대용량 문자열을 다룰 때
    }
}
