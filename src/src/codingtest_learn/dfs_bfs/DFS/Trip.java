package codingtest_learn.dfs_bfs.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Trip {
    StringBuilder sb = new StringBuilder();

    boolean[] isUsed;
    String result = "J";

    public String[] solution(String[][] tickets) {
        isUsed = new boolean[tickets.length];

        sb.append("ICN ");
        dfs(0,"ICN", tickets);

        String[] answer = result.split(" ");

        return answer;
    }

    public void dfs(int count, String start, String[][] tickets) {
        //이동횟수 == 티켓횟수면 모든 티켓 사용한 경우에 리턴
        if (count==tickets.length) {
            //현재 완성된 이동경로와 이전 이동경로끼리 알파벳 순서 비교
            result = (result.compareTo(sb.toString()) > 0)? sb.toString() : result;
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (!isUsed[i] && tickets[i][0].equals(start)) {
                isUsed[i] = true;
                sb.append(tickets[i][1]).append(" ");
                dfs(count+1, tickets[i][1], tickets);
                isUsed[i] = false;
                sb.delete(sb.length()-4, sb.length());
            }
        }
    }

    public static void main(String[] args) {
        String[][] tikets = {{"ICN","D"},{"D","ICN"},{"ICN","B"}};
        Trip trip1 = new Trip();
        System.out.println(Arrays.toString(trip1.solution(tikets)));

    }
}
