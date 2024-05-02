package solution2;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ints = new int[N];
        int temp=0;
        for (int i = 0; i < N; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N-1; j++) {
                if (ints[j] > ints[j + 1]) {
                    temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}