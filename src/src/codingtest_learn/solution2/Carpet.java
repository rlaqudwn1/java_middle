package codingtest_learn.solution2;

import java.util.Arrays;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int result = brown + yellow;
        int[] answer = {0,0};
        int x = 1,y=0;
        int countx= 0;
        int county=0;
        while (x * y != result) {
            for (int i = 1; i <=x; i++) {
                if (x * i == result) {
                    answer[0]=x;
                    answer[1]=i;
                    return answer;
                }
            }
            x++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet();
        System.out.println(Arrays.toString(carpet.solution(18, 6)));
    }
}
