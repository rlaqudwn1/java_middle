package dfs_bfs.BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Maze2 {
    static  int[] dx={1,0,-1,0};
    static  int[] dy={0,1,0,-1};
    public int solution(String[] maps) {
        int answer = 0;
        int lenthy = maps[0].length();
        int lenthx = maps.length;

        int[] start = {0, 0};
        int[] lab = {0, 0};
        String[][] map = new String[lenthx][lenthy];
        for (int i = 0; i < lenthx; i++) {
            for (int j = 0; j <lenthy; j++) {
                map[i][j] = maps[i].substring(j, j + 1);
                if (map[i][j].equals("S")) {
                    start[0] = i;
                    start[1] = j;
                }if (map[i][j].equals("L")) {
                    lab[0] = i;
                    lab[1] = j;
                }
            }
        }

        answer = BFS(map,lenthx,lenthy,start,lab);
        System.out.println(Arrays.deepToString(map));
        return answer;
    }

    private int BFS(String[][] map, int lenthx, int lenthy,int[] start, int[] lab) {
        Queue<int[]> queue = new LinkedList<>();
        int[] now = start;
        queue.offer(now);
        boolean[][] checktable = new boolean[lenthx][lenthy];
        checktable[0][0]=true;
        boolean count = false;
        int[][] costlist = new int[lenthx][lenthy];
        int cost=0;
        while (!queue.isEmpty()) {
            now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];
                if (x >= 0 && y >= 0 && x < lenthx && y <  lenthy&&!checktable[x][y]) {
                    if (map[x][y].equals("O")) {
                        queue.add(new int[]{x,y});
                        checktable[x][y]=true;
                        costlist[x][y]= costlist[now[0]][now[1]]+1;
                    } else if (map[x][y].equals("L")) {
                        queue.add(new int[]{x,y});
                        count=true;
                        costlist[x][y]= costlist[now[0]][now[1]]+1;
                    } else if (map[x][y].equals("E")&&count) {
                        return cost=costlist[now[0]][now[1]]+1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Maze2 maze2 = new Maze2();
        String[] maps = {"SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE"};
        maze2.solution(maps);
    }
}
/**
 * import java.util.LinkedList;
 * import java.util.Queue;
 *
 * class Solution {
 *     static String[][] MIRO;
 *     static int[] dx = {-1, 1, 0, 0};
 *     static int[] dy = {0, 0 , -1, 1};
 *
 *     public int solution(String[] maps) {
 *         MIRO = new String[maps.length][maps[0].length()];
 *         int[] start = new int[2];
 *         int[] labor = new int[2];
 *
 *         for(int i = 0; i<maps.length; i++) {
 *             String[] tmp = maps[i].split("");
 *
 *             for(int j = 0; j<tmp.length; j++) {
 *                 MIRO[i][j] = tmp[j];
 *
 *                 if (MIRO[i][j].equals("S")) {
 *                     start = new int[]{i, j};
 *                 }
 *
 *                 if (MIRO[i][j].equals("L")) {
 *                     labor = new int[]{i, j};
 *                 }
 *             }
 *         }
 *
 *         int result = bfs(start, "L");
 *         int result2 = bfs(labor, "E");
 *
 *         if (result == -1 || result2 == -1)
 *             return -1;
 *
 *         return result + result2;
 *     }
 *
 *     public int bfs(int[] start, String target) {
 *         Queue<int[]> queue = new LinkedList<>();
 *         queue.add(new int[]{start[0], start[1], 0});
 *
 *         boolean[][] visited = new boolean[MIRO.length][MIRO[0].length];
 *
 *         while(!queue.isEmpty()) {
 *             int x = queue.peek()[0];
 *             int y = queue.peek()[1];
 *             int count = queue.peek()[2];
 *             visited[x][y] = true;
 *
 *             if (MIRO[x][y].equals(target)) {
 *                 return count;
 *             }
 *
 *             queue.poll();
 *
 *             for(int i = 0; i<4; i++) {
 *                 int nx = x + dx[i];
 *                 int ny = y + dy[i];
 *
 *                 if (nx >= 0 && nx < MIRO.length && ny >= 0 && ny < MIRO[0].length && !visited[nx][ny]) {
 *                     if (!MIRO[nx][ny].equals("X")) {
 *                         visited[nx][ny] = true;
 *                         queue.add(new int[]{nx, ny, count+1});
 *                     }
 *                 }
 *             }
 *         }
 *
 *         return -1;
 *     }
 * }
 */