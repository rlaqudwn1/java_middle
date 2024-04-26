package solution;

import java.util.Arrays;

public class BigNum {

        public int[] solution(int[] numbers) {
            int[] answer = {};
            answer = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length - 1) {
                    answer[i] = -1;
                    break;
                }
                answer[i] = findUpperNum(numbers, i);
            }
            return answer;
        }

    /**
     * 밑에서부터 큰 수를 찾아 넘긴다
     */
        private int findUpperNum(int[] numbers, int i) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    return numbers[j];
                }
            }
            return -1;
        }


    public static void main(String[] args) {
        int[] answer;
        BigNum bigNum = new BigNum();
        int[] sol = new int[]{9, 1, 5, 3, 6, 2};
        answer=bigNum.solution(sol);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
