package codingtest_learn.dfs_bfs.DFS;

import java.util.Arrays;

public class Ice {
    public static int n=4, m = 5;
    public static int[][] graph =   {
            {0, 0, 1, 1, 0}
            ,{0, 0, 0, 1, 1}
            ,{1, 1, 1, 1, 1}
            ,{0, 0, 0, 0, 0}
    };
    public static void main(String[] args) {
        int result= 0;
        System.out.println("n" + graph.length);
        System.out.println("m = "+graph[0].length);
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if (dfs(j, i)) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
        System.out.println(Arrays.deepToString(graph));

    }

    private static boolean dfs(int x, int y) {
        if (x <= -1 || y >=n || y <= -1 || x >= m) {
            return false;
        }
            if (graph[y][x] == 0) {
                graph[y][x] = 1;
                dfs(x - 1, y);
                dfs(x + 1, y);
                dfs(x , y+1);
                dfs(x , y-1);
                return true;
            }
        return false;
    }
}
