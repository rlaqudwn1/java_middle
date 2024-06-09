package codingtest_learn.solution;

public class H_Index {
    public int solution(int[] citations) {
        int[] answer = {0};
        int count=0;
        int count2=0;
        Find(citations,count,count2,answer);
        return answer[0];
    }

    private void Find(int[] citations, int count, int count2, int[] answer) {
        for (int i = 0; i < citations.length; i++) {
            if (count <= citations[i]) {
                count2++;
            }
        }
        if (count2 == 0) {
            answer[0] = 0;
            return;
        }
        if (count >= count2) {
            answer[0] = count;
            System.out.println(answer[0]);
            return;
        }
        count++;
        count2=0;
        Find(citations,count,count2, answer);
    }

    public static void main(String[] args) {
        H_Index hIndex = new H_Index();
        int[] sol = {6, 5, 3, 3, 0};
        System.out.println(hIndex.solution(sol));
    }
}
