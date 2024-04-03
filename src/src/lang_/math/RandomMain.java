package lang_.math;
import java.util.Random;
public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
//        Random random = new Random(1);  //seed가 같으면 Random의 결과가 같다
        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble(); //0.0d~1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomboolean = random.nextBoolean();
        System.out.println("randomboolean = " + randomboolean); //랜덤 boolean값 반환
        //범위 조회

        int randomRange1 = random.nextInt(10);          //0~9까지 랜덤 반환
        System.out.println("0~9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;// 1~10까지 랜덤반환
        System.out.println("1 ~ 10: " + randomRange2);


    }
}
