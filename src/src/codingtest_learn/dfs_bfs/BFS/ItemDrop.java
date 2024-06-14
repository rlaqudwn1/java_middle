package codingtest_learn.dfs_bfs.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *  지도를 2배로 늘려야 한다 좌표상 갈수 있는 곳에 대해 ㄷ자가 들어가게 되면
 *  ㄷ자의 빈 ㅣ 부분을 뚫고 들어가는 오류가 생길 수 있다.
 */

public class ItemDrop {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    // 지나갈 수있는 다각형 테두리 좌표의 배열
    boolean[][] rect = new boolean[102][102];
    // 다녀간 곳인지 확인하는 배열
    boolean[][] visited = new boolean[102][102];
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        find_rect(rectangle);
        answer=bfs(rectangle, characterX+2, characterY*2,itemX*2,itemY*2);
        System.out.println(answer);
        return answer;
    }

    private int bfs(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        Queue<int[]> queue = new LinkedList<>();
        visited[characterY][characterX] = true;

        queue.add(new int[]{characterX, characterY, 0});
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = arr[0] + dx[i];
                int y = arr[1] + dy[i];
                if (x < rect[0].length && y < rect.length && rect[y][x] && !visited[y][x]) {
                    visited[y][x]=true;
                    queue.add(new int[]{x, y, arr[2] + 1});
                }
                if (visited[itemY][itemX]) {
                    return arr[2]+1;
                }
            }
        }
        return characterX;
    }

    // 각 사각형의 가장자리에 선을 긋고 사각형 안쪽에 생긴 선들을 전부 false로 지나갈 수 없게 만든다.
//     그리드 형식으로 리팩토링 필요해보임.
    private void find_rect(int[][] rectangle) {
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = rectangle[i][0]; j <= rectangle[i][2]*2; j++) {
                rect[rectangle[i][1]][j]=true;
                rect[rectangle[i][3]][j]=true;
            }
        }

        for (int i = 0; i < rectangle.length; i++) {
            for (int j = rectangle[i][1]; j <= rectangle[i][3]*2; j++) {
                rect[j][rectangle[i][0]]=true;
                rect[j][rectangle[i][2]]=true;
            }
        }


        for (int i = 0; i < rectangle.length; i++) {
            for (int j = (rectangle[i][1]+1); j < rectangle[i][3]*2; j++) {
                for (int k = (rectangle[i][0]+1); k < rectangle[i][2]*2; k++) {
                    rect[j][k]=false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] rect = {{1, 1, 7, 4}, {3, 2, 5, 5}, {4, 3, 6, 9}, {2, 6, 8, 8}};
        int charx = 1;
        int chary = 3;
        int itemx= 7;
        int itemy = 8;
        ItemDrop itemDrop = new ItemDrop();
        itemDrop.solution(rect,charx, chary, itemx, itemy);

    }
}
