package codingtest_learn.KaKao.Blind2019;

import java.util.*;

/**
 *
 */
public class FailPercent {
    public int[] solution(int N, int[] stages) {
        ArrayList<int[]> arrayList = new ArrayList<>();
        // {스테이지 번호, 성공수, 도달수}를 저장할 int 배열 저장
        for (int i = 0; i < N; i++) {
            arrayList.add(new int[]{i + 1, 0, 0});
        }
        // 도달스테이지에서 성공수와 도달수를 체크하는 반복문
        for (int stage : stages) {
            for (int j = 0; j <= stage - 1; j++) {
                if (j == arrayList.size()) {
                    break;
                }
                arrayList.get(j)[2] += 1;
            }
            for (int j = 0; j <= stage - 2; j++) {
                arrayList.get(j)[1] += 1;
            }
        }
        ArrayList<double[]> arrays = new ArrayList<>();// 성공수와 도달수로 반대인 실패율을 저장할 double 배열
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)[1] == 0 && arrayList.get(i)[2] == 0) {//도달하지 못한 스테이지의 실패율은 0
                arrays.add(new double[]{i + 1, 0});
            }else arrays.add(new double[]{i + 1, 1 - ((double) arrayList.get(i)[1] / arrayList.get(i)[2])});    //1-성공률=실패율
        }
        arrays.sort(new Comparator<double[]>() {                //실패율 기반 내림차순 실패율이 같으면 순서기반 오름차순으로 정렬
            @Override
            public int compare(double[] o1, double[] o2) {
                if (Double.compare(o2[1], o1[1]) == 0) {
                    return Double.compare(o1[0] ,o2[0]);
                }else return Double.compare(o2[1], o1[1]);
            }
        });
        int[] answer = new int[N];
        for (int i = 0; i < arrays.size(); i++) {
            answer[i] = (int) arrays.get(i)[0];
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] stages = {1,1,1,2,3,4};
        FailPercent failPercent = new FailPercent();
        System.out.println(Arrays.toString(failPercent.solution(n, stages)));
    }
}
