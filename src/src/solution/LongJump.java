package solution;


import java.util.Stack;

public class LongJump {
    public int solution(int n) {
        int[] answer = {0};
        int count=0;

        DFS(n,answer);
        return answer[0];
    }

    public void DFS(int n, int[] answer) {
        int num = 1;
        while (num != n) {
            // 아 잠만
        }

    }
    public static void main(String[] args) {

        LongJump longJump = new LongJump();
        longJump.solution(4);
    }
}
