package codingtest_learn.KaKao.Blind2018;

/**
 * 2*2의 형태로 같은 모양의 블록이 4개가 붙어있다면 애니팡처럼 터지며 점수를 쌓는방식.
 * 2*2의 형태가 중복이 되면 한꺼번에 같이 터지고 점수는 터진 블록 수 만큼만 받는다.
 * 터진 블록위에 있던 블록들은 다시 아래로 내려온다.
 */

import java.util.Arrays;


public class Friends4 {
    static int score=0;
    static int[] dx = {1, 1,0};
    static int[] dy = {0, 1, 1};   // 오른쪽에서부터 2*2를 확인하는 좌표
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        String[][] sink = new String[m][n];
        boolean[][] checktable = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            String[] split = board[i].split("");
            for (int j = 0; j < n; j++) {
                sink[i][j] = split[j];
            }
        }
        for (int q = 0; q < 10; q++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!sink[i][j].equals("X")) check(i, j, sink, checktable);             //"X"가 되어버린 구간 제외하고 전 구간에 대하여 2*2를 찾는 check함수를 사용한다
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (checktable[i][j]) {
                        temp(i, j, checktable, sink);                                       //temp 함수로 배열 모든 구간에서 찾은 2*2인 배열을 터트리고 재배치한다
                    }
                }
            }
        }

        answer=score;
        return answer;
    }
// * 2*2 를 터트리고 점수반환 블록재배치하는 temp함수 터진 부분의 배열을 X로 치환하고 X는 탐지하지 않도록 한다.

    private void temp(int i, int j, boolean[][] checktable, String[][] sink) {
        if (i == 0) {
            checktable[i][j] = false;
            sink[i][j] = "X";
            score++;
        } else {
            for (int k = i; k >0 ; k--) {
                if (!sink[k - 1][j].equals("X")) {
                    sink[k][j] = sink[k - 1][j];
                    sink[k - 1][j] = "X";
                }else break;
            }
            checktable[i][j] = false;
            score++;
        }
    }
// * 2*2 를 찾는 반복행위는 check함수
    private void check(int i, int j, String[][] sink, boolean[][] checktable) {
        if (i + 1 < sink.length && j + 1 < sink[0].length) {
            if (sink[i][j].equals(sink[i][j + 1]) && sink[i][j].equals(sink[i + 1][j + 1]) && sink[i][j].equals(sink[i + 1][j])) {
                checktable[i][j]=true;
                checktable[i][j+1]=true;
                checktable[i+1][j+1]=true;
                checktable[i+1][j]=true;
            }
        }
    }

    public static void main(String[] args) {
        int m=7;
        int n=2;
        String[] board = {"AA", "BB", "AA", "BB", "ZZ", "ZZ", "CC"};
        Friends4 friends4 = new Friends4();
        System.out.println(friends4.solution(m, n, board));
    }
}
