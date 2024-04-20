package object.test;
import java.util.Random;

public class Lotto {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count=0;
        while (count < 6) {
            int sameNum= random.nextInt(45)+1;
            if (isUnique(sameNum)) {
                lottoNumbers[count++] = sameNum;
            }
        }
        return lottoNumbers;
    }

    public boolean isUnique(int number) {
        for (int lottoNumber : lottoNumbers) {
            if (lottoNumber == number) {
                return false;
            }
        }
        return true;
    }
}
