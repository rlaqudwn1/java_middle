package codingtest_learn.KaKao.Internship2019;

import java.util.Stack;

public class KaKao_doll {
    //1. 배열에서 moves에 해당하는 값을 찾고 그 값을 스택에 넣는다'
    //2. 그배열 자리에 0을 대입하고 스택의 peek값과 일치하면 poll하고 answer+=2한다.

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i]-1] != 0) {
                    if (stack.isEmpty()) {       //스택이 비어있지 않을 경우
                        stack.add(board[j][moves[i]-1]);
                        board[j][moves[i]-1]=0; // 인형을 찾은 자리는
                        break;
                    } else if (board[j][moves[i]-1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                        board[j][moves[i]-1]=0; // 인형을 찾은 자리는 0으로 놓는다.
                        break;
                    } else {
                        stack.add(board[j][moves[i]-1]);
                        board[j][moves[i]-1]=0; // 인형을 찾은 자리는 0으로 놓는다.
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        KaKao_doll kaKao = new KaKao_doll();
        int[][] sol = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};


        System.out.println(kaKao.solution(sol, moves));
    }
}
