package solution;

import java.util.Arrays;

public class Expectaion {
    public int solution(int n, int a, int b) {
        int answer = 0;
        int[] asd = {0, 3, 4};


        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }

    //두 수를 2로 나누고 몫이 같아질 때 까지 나누고
    // 나눈 횟수가 answer


    public static void main(String[] args) {
        Expectaion expectaion = new Expectaion();
        System.out.println(expectaion.solution(16, 2, 7));

    }
}
