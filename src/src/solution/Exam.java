package solution;

import java.util.HashMap;

/**
 * 1. 모든 시간단위를 분단위로 계산한다
 * 2. start_time을 기준으로 오름차순으로 정렬한다.
 * 3. if(start_time+playtime)
 * 3. start_time+playtime이 다음 start값보다 작거나 같을 경우 result에 name을 입력
 * 4. start_time+playtime이 다음 start값보다 클 경우 start_time+playtime-next_start값을 새로운 배열에 저장한다.
 * 5.
 */
public class Exam {
    public String[] solution(String[][] plans) {
        String[] answer = {};
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < plans.length; i++) {
            hashMap.put((Integer.parseInt(plans[i][1].substring(0, 2)))*(60) + Integer.parseInt(plans[i][1].substring(3, 5)),plans[i][0]);
        }
        System.out.println(Integer.parseInt(plans[1][1].substring(3, 5)));
        System.out.println(hashMap);
        return answer;
    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        String[][] plans = {{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}};
        exam.solution(plans);
    }
}
