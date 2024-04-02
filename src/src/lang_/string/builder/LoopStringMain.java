package lang_.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();

        String result="";
        for (int i = 0; i<100000; i++){
            result+="hello Java";               //rsult = new StingBuilder().append(result).append("Hello Java").toSting();
                                                // 10만번의 객체 생성으로 최적화가 안된다
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result = " + result);
        System.out.println("time = " +(endTime-starTime)+"ms");
    }
}
