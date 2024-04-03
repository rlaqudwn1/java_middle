package lang_.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lotto;
    private int count = 0;

    private boolean notSame(int val) {
        for (int i = 0; i < count; i++) {
            if (lotto[i] == val) {
                return false;
            }
        }
        return true;
    }
    public int[] getLotto(){
        lotto=new int[6];
        count = 0;
        while (count < 6) {
            int random_num=random.nextInt(45)+1;
            if (notSame(random_num)==true){
                lotto[count]=random_num;
                count++;
            }
        }
        return lotto;
    }
}
