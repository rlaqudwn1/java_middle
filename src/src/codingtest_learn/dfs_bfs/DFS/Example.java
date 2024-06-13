package codingtest_learn.dfs_bfs.DFS;

public class Example {
    // 방문처리 사용되리 배열
    static boolean[] visited = new boolean[9];
    static int[][] graph = {{2, 3, 8}, {1, 6, 8}, {1, 5}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};

    public static void main(String[] args) {
        dfs(1);
    }

    private static void dfs(int i) {
        //방문 처리
        visited[i] = true;

        System.out.println("i = " + i);
        for (int ints : graph[i]) {
            if (!visited[i]) {
                dfs(i);
            }
        }

    }
}
