package codingtest_learn.solution;

import java.math.BigInteger;
import java.util.Arrays;

public class LCM {
    public int solution(int[] arr) {
        BigInteger gcd1= BigInteger.valueOf(0);
        BigInteger lcm= BigInteger.valueOf(0);

        BigInteger[] bigIntegers = new BigInteger[arr.length];
        for (int i = 0; i < arr.length; i++) {
            bigIntegers[i] = BigInteger.valueOf(arr[i]);
        }
        for (int i = 0; i < bigIntegers.length-1; i++) {
             gcd1=bigIntegers[i].gcd(bigIntegers[i + 1]);
            bigIntegers[i+1] = BigInteger.valueOf(((long) bigIntegers[i].intValue() * bigIntegers[i + 1].intValue()) / gcd1.intValue());
        }
        int answer = bigIntegers[bigIntegers.length-1].intValue();
        return answer;
    }
        public static void main (String[]args){
            LCM lcm = new LCM();
            int[] sol = {2, 6, 8, 14};
            System.out.println(lcm.solution(sol));
        }

}