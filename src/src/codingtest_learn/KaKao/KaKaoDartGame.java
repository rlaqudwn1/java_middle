package codingtest_learn.KaKao;

import java.util.ArrayList;

// *과 #의 취급에 주의
public class KaKaoDartGame {
    public int solution(String dartResult) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int answer = 0;
        int aim = 0;
        char[] dart = dartResult.toCharArray();
        for (int i = 0; i < dart.length; i++) {
            if (dart[i] == '#') {
                integerArrayList.set(integerArrayList.size() - 1, integerArrayList.get(integerArrayList.size() - 1) * -1);
            }
            if (dart[i] == '*') {
                if (integerArrayList.size() == 1) {
                    integerArrayList.set(0, integerArrayList.getFirst() * 2);
                } else {
                    integerArrayList.set(integerArrayList.size() - 1, integerArrayList.get(integerArrayList.size() - 1) * 2);
                    integerArrayList.set(integerArrayList.size() - 2, integerArrayList.get(integerArrayList.size() - 2) * 2);
                }
            }else if (dart[i] <= '9') {
                integerArrayList.add(Integer.parseInt(String.valueOf(dart[i])));
                if (dart[i + 1] == '0') {
                    integerArrayList.set(integerArrayList.size() - 1, 10);
                    i++;
                }
            } else if (dart[i] == 'D') {
                integerArrayList.set(integerArrayList.size() - 1, (int) Math.pow(integerArrayList.get(integerArrayList.size() - 1), 2));

            } else if (dart[i] == 'T') {
                integerArrayList.set(integerArrayList.size() - 1, (int) Math.pow(integerArrayList.get(integerArrayList.size() - 1), 3));
            }
        }

        for (Integer i : integerArrayList) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        KaKaoDartGame kaKaoDartGame = new KaKaoDartGame();
        String dart= "1S2D*3T";
        System.out.println(kaKaoDartGame.solution(dart));
    }
}
