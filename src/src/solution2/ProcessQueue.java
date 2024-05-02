package solution2;

/**
 *
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProcessQueue {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        for (int priority : priorities) {
            integerLinkedList.add(priority);
        }
        //Queue 가 빌 때 까지반복
        while (!integerLinkedList.isEmpty()) {
            int polled = integerLinkedList.poll();

            boolean check = true;
            // location이 0이되어 빠질 차례가 됐을 경우
            // location이 가리키는 값보다 큰 값이 있으면 location이 빠져나가지 못했으므로 check=false; 로 놓는다
            if (location == 0) {
                for (int i = 0; i < integerLinkedList.size(); i++) {
                    if (polled < integerLinkedList.get(i)) {
                        integerLinkedList.add(polled);
                        check = false;
                        break;
                    }
                }

                //location값이 빠져나가 true 이면 프로세스 실행 횄수++ 리턴
                if (check) {
                    answer++;
                    return answer;
                }
                //location 값이 0 이 아닐 경우에 poll된 값보다 큰값이 있는 경우
                //true를 반환하며 poll된 값을 다시 넣지 않는다
            } else {
                for (int i = 0; i < integerLinkedList.size(); i++) {
                    if (polled < integerLinkedList.get(i)) {
                        integerLinkedList.add(polled);
                        check=false;
                        break;
                    }
                }
                if (check) {
                    answer++;
                }
            }
            location--;
            //location이 0 보다 작으면 loctaion이 다시 넣어지는 것을 의미하므로
            //다시 그 값을 가리키기 위해 location에 size를 더해준다
            if (location < 0) {
                location += integerLinkedList.size();
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        ProcessQueue processQueue = new ProcessQueue();
        int[] pri = {1,1,9,1,1,1};
        int location = 0;
        System.out.println(processQueue.solution(pri, location));
    }

}
