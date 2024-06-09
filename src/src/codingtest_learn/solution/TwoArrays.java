package codingtest_learn.solution;
import java.util.Arrays;

public class TwoArrays {
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        int count=0;
        int[][] sol = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sol[i][j]+=count+i+1;
            }
        }
        System.out.println(Arrays.deepToString(sol));
        return answer;
    }

    public static void main(String[] args) {
        TwoArrays twoArrays = new TwoArrays();
        int n =3;
        int left = 2;
        int right = 5;

        System.out.println(Arrays.toString(twoArrays.solution(n, left, right)));
    }

}
