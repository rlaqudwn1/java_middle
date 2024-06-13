package codingtest_learn.dfs_bfs.DFS;

public class TargetNum {
    static int answer =0;
    public int solution(int[] numbers, int target) {

        dfs(numbers, 0, target, 0);

        return answer;

    }
    private void dfs(int[] numbers, int result, int target, int i) {
        if (i == numbers.length) {
            if (result == target) {
                answer++;
            }
            return;
        }
        dfs(numbers, result - numbers[i], target, i + 1);
        dfs(numbers, result + numbers[i], target, i +1);
    }
    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        TargetNum targetNum = new TargetNum();
        System.out.println(targetNum.solution(numbers, 4));

    }
}
