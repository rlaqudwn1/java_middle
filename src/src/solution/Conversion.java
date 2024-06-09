package solution;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 프로그래머스 레벨2 숫자 변환하기 bfs풀이
 * 1. x에 2를 곱하거나 3을 곱하거나 n을 더했을 경우 y에 도달하는가
 * 2. y에 도달하지 않으면 곱하고 더한 값을 Queue에 넣어 bfs탐색
 * 3. 가장 먼저 발견되는 값의 count가 최소 카운트 이므로 바로 return
 * ex) 방문배열의 checktable의 배열길이에 오류가 있어서 런타임 에러가 발생했다(최대 길이 초과)
 * 초기값 설정에 유의하자.
 */
public class Conversion {
    class KeyX {
        int x;
        int count;
        public KeyX(int x, int count) {
            this.x = x;
            this.count = count;
        }
    }
    public int solution(int x, int y, int n) {
        int answer=0;
        answer = dfs(x, y, n);
        return answer;
    }
    private int dfs ( int x, int y, int n){
        boolean[] checktable = new boolean[1000001];
        Queue<KeyX> queue = new LinkedList<>();
        queue.add(new KeyX(x, 0));
        checktable[0]=true;
        while (!queue.isEmpty()) {
            KeyX resource = queue.poll();
            if (resource.x == y) {
                return resource.count;
            }
            if (resource.x * 2 <= y && !checktable[resource.x * 2]) {
                queue.add(new KeyX(resource.x * 2, resource.count + 1));
                checktable[resource.x*2]=true;
            }if (resource.x * 3 <= y && !checktable[resource.x * 3]) {
                queue.add(new KeyX(resource.x *3, resource.count + 1));
            }checktable[resource.x*3]=true;
            if (resource.x + n <= y && !checktable[resource.x + n]) {
                queue.add(new KeyX(resource.x + n, resource.count + 1));
                checktable[resource.x + n] = true;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println(conversion.solution(10, 40, 5));
    }

}
