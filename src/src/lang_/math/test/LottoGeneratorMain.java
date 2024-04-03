package lang_.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lotto = new LottoGenerator();
        
        int [] lottoNum=lotto.getLotto();
        System.out.println("로또 번호: " + Arrays.toString(lottoNum));
    }
}
