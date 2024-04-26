package solution;

public class Fibonachi {
    public int solution(int n) {
        int answer = 0;
        int result=0;
        int[] f1 = {0, 1};
        for (int i = 1; i < n; i++) {
            result = (f1[0] + f1[1])%1234567;
            f1[0] = f1[1];
            f1[1]=result;
        }
        answer=result;
        return answer;
    }

    public static void main(String[] args) {
        Fibonachi fibonachi = new Fibonachi();
        fibonachi.solution(3);
    }
}
