package solution2;

import java.util.*;

public class ABS {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> {
            // 절댓값이 같은 경우 음수 우선
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;
            }
            // 절댓값 작은 데이터 우선
            return first_abs-second_abs;
        }));
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                if (queue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(num);
            }
        }
    }
}
