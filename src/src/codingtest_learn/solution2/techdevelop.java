package codingtest_learn.solution2;


// 프로그래머스 기능개발

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * for{progresss 순서에 맞게 speeds들을 더해주고 하루를 추가한다
 * 만약 progress의 첫번째가 100이상이 되었을 경우 poll하며
 *  다음 progress도 100이상인지 확인하고 아니면 progress가 100이상이 될 떄 까지 반복
 *  한 날에 진행된 progress 만큼 return에 ++;
 * }
 */
public class techdevelop {
    public int[] solution(int[] progresses, int[] speeds) {
    ArrayList<Integer> answer = new ArrayList<>();
    int count=0;
    int anscount=0;
    int progresscheck=0;
    Queue<Integer> pro = new LinkedList<>();
    Queue<Integer> speedque = new LinkedList<>();
    for (int progress : progresses) {
        pro.add(progress);
    }
    for (int speed : speeds) {
        speedque.add(speed);
    }
    System.out.println(pro);
    System.out.println(speedque);
    while (!(pro.size()==0)) {
        if (pro.isEmpty()) {
            break;
        }

        count=0;
        //프로그램 배열에 스피드 배열을 더한다.
        for (int i = 0; i < progresses.length; i++) {
            progresses[i] += speeds[i];
        }
        // 프로그램 배열의
        while (progresses[progresscheck] >= 100) {
            pro.poll();
            speedque.poll();
            progresscheck++;
            count++;
            if (progresscheck == progresses.length) {
                break;
            }
        }
        if (count > 0) {
            answer.add(count);
        }

    }
    int[] answer2 = new int[answer.size()];
    for (int i = 0; i < answer.size(); i++) {
        answer2[i] = answer.get(i);
    }
    return answer2;
}

    public static void main(String[] args) {
        techdevelop techdevelop = new techdevelop();
        int[] pro = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println((Arrays.toString(techdevelop.solution(pro, speeds))));
    }

}
