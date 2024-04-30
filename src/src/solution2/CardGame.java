package solution2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardGame {
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
