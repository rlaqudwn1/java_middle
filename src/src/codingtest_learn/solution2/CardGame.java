package codingtest_learn.solution2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardGame {
    /**
     * 백준 2161 카드1
     * 1.Queue에 N개의 오름차순으로 넣는다.
     * 2.Queue의 크기가 1이 될때까지 반복한다.
     * 3.맨제일 작은(큐의 맨 아래의) 숫자를 poll하고 poll한 숫자를 add한다
     */
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerQueue.offer(i + 1);
        }
        while (integerQueue.size() != 1) {
            integerQueue.poll();
            integerQueue.add(integerQueue.poll());
        }
        System.out.println(integerQueue.peek());
    }
}
