package codingtest_learn.solution;

import java.util.Arrays;

/**
 * 연속된 부분 수열의 합
 * 1. 투포인터를 이용해 수열의 합을 start_index , end_index를 지정해 수열을 조정한다.
 * 1-1 end_index값을 result에 추가하여 result 값이 k를 초과하면 start_index의 값을 빼고
 * 1-2 result 값이 k보다 작으면 다시 end_index의 값을 늘린다.
 */
public class Continue_Num {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        int start_index=0;
        int end_index=0;
        int result=0;
        int[] answer2 = {0,1000000};
        for (int i = 0; i < sequence.length; i++) {
            result += sequence[end_index];
            while (result > k) {
                result -= sequence[start_index++];
            }
            if (result == k) {
                int len = answer2[1] - answer2[0];
                if (len > end_index - start_index) {
                    answer2[0]=start_index;
                    answer2[1]=end_index;
                } else if (len==end_index-start_index) {
                    if (start_index < answer2[0]) {
                        answer2[0]=start_index;
                        answer2[1]=end_index;
                    }
                }
            }
            end_index++;
        }
        answer = answer2.clone();
        return answer;
    }
    public static void main(String[] args) {
        Continue_Num continueNum = new Continue_Num();
        int[] seq = {2, 2, 2, 2, 2};
        System.out.println(Arrays.toString(continueNum.solution(seq, 6)));
    }
}
