package codingtest_learn.dfs_bfs.DFS;

import java.util.ArrayList;
import java.util.Arrays;

public class Trip {
    static String[][] ticket;
    static int x;
    static int y=2;
    static ArrayList<String[]> strings;
    static boolean[][] trip;
    static boolean[][] trip2;
    static String res = "ICN";
    static String res2 = "ICN";
    static String[]
    public String[] solution(String[][] tickets) {
        System.out.println(x);
        String[] answer = {};
        String start = "ICN";
        dfs(tickets, start,0);
        int count =0;
        ArrayList<Integer> icn = new ArrayList<>();
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals("ICN")) {
                count++;
                icn.add(i);
            }
        }
        for (int i = 0; i < icn.size(); i++) {
            dfs(tickets, start, icn.get(i));
        }
        System.out.println(res);
        System.out.println(res2);
        return answer;
    }

    private void dfs(String[][] tickets, String start,int cnt) {
        for (int i = 0; i < x; i++) {
            if (tickets[i][0].equals(start)&&!trip[i][0]) {
                trip[i][0]=true;
                dfs(tickets,tickets[i][1],cnt++);
            }
        }
    }

    public static void main(String[] args) {
        String[][] tikets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        ticket = tikets;
        x = tikets.length;
        boolean[][] clone = new boolean[x][y];
        trip = clone.clone();
        trip2 = new boolean[x][y];
        Trip trip1 = new Trip();
        trip1.solution(tikets);


    }
}
