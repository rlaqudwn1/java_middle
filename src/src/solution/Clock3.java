package solution;

import java.util.Scanner;

public class Clock3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        for (int i = 0; i < N+1; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (Integer.toString(i).contains("3") || Integer.toString(j).contains("3") || Integer.toString(k).contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
