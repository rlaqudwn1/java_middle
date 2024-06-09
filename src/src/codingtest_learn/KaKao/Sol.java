package codingtest_learn.KaKao;

import java.util.Arrays;

public class Sol {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] sol = new int[rows][columns];
        int a=1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sol[i][j] = a++;
            }
        }

        System.out.println(Arrays.deepToString(sol));
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        int rows=6;
        int colums=6;
        int[][] queries = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
        Sol sol = new Sol();
        sol.solution(rows, colums, queries);
    }
}
