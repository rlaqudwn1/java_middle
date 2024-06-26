package codingtest_learn.solution;

import java.util.Arrays;

public class MinArray {
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer+=A[i]*B[B.length-1-i];
        }
        return answer;
}

    public static void main(String[] args) {
        MinArray minArray = new MinArray();
        int A[] = {1, 4, 2};
        int B[] = {5, 4, 4};
        System.out.println(minArray.solution(A, B));
    }

}
