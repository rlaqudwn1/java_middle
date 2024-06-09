package codingtest_learn.solution2;

import java.util.Scanner;

public class TwoPointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextInt();
        int count=1;
        int sum = 1;
        int start_index = 1;
        int end_index = 1;

        while (end_index != N) {
            if (sum < N) {
                end_index++;
                sum+=end_index;
            }else if (sum == N) {
                end_index++;
                count++;
                sum += end_index;
            }else if (sum > N) {
                sum-=start_index;
                start_index++;
            }
        }

        System.out.println(count);

    }

}
