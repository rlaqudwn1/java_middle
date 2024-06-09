package codingtest_learn.solution;

public class ContinueNum {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            int sum =0;
            for (int j = i; j < n; j++) {
                sum += j;
                System.out.println(sum);
                if (sum > n) {
                    break;
                }
                if (sum == n) {
                    answer++;
                    break;
            }
            }
        }
        System.out.println(answer);
        return ++answer;
    }

    public static void main(String[] args) {
        ContinueNum continueNum = new ContinueNum();
        continueNum.solution(15);
    }
}
