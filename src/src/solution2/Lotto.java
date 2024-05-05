package solution2;

import java.util.Arrays;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7,7};
        int max=0;
        int count=0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                max++;
            }else {
                for (int i1 : win_nums) {
                    if (lottos[i] == i1) {
                        count++;
                    }
                }
            }
        }
        if (count < 2&&count+max<2) {
            answer[1]=6;
            answer[0]=6;
        } else if (count < 2) {
            answer[1] = 6;
            answer[0]-=count+max;
        } else {
            answer[0]-=count+max;
            answer[1]-=count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(lotto.solution(lottos, win_nums)));
    }
}
