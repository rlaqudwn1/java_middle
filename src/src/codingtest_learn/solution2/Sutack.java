package codingtest_learn.solution2;

import java.util.Scanner;
import java.util.Stack;

public class Sutack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i]= scanner.nextInt();
        }
        Stack<Integer> integers = new Stack<>();
        int num =1;
        boolean result= true;
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            int su = A[i];
            if (su >=num) {
                while (su >= num) {
                    integers.push(num++);
                    bf.append("+\n");
                }
                integers.pop();
                bf.append("-\n");
            }else {
                int n = integers.pop();
                if (n > su) {
                    System.out.println("No");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());
    }
}
