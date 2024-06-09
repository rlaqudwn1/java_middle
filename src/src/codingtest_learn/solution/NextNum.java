package codingtest_learn.solution;

import java.util.Arrays;

public class NextNum {
    public int solution(int n) {
        int answer = n+1;

        while (true) {
            if (Integer.bitCount(answer) == Integer.bitCount(n)) {
                return answer;
            }
            answer++;
        }
//        String numn="";
//        String[] splitnum;
//        String[] splitnum1;
//        splitnum = Integer.toBinaryString(n).split("0");
//        for (String string : splitnum) {
//            numn=numn.concat(string);
//        }
//        System.out.println(Integer.bitCount(n));
//        while (true) {
//            String numn1="";
//            splitnum1 = Integer.toBinaryString(answer).split("0");
//            for (String string2 : splitnum1) {
//                numn1 = numn1.concat(string2);
//            }
//            if (numn.length()==numn1.length())break;
//            answer++;
//
//        }
//        return answer;
    }

    public static void main(String[] args) {
        NextNum nextNum = new NextNum();
        System.out.println(nextNum.solution(78));
    }
}
