package solution;

import java.math.BigInteger;

public class LCM {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = new int[arr.length];
        int[] arr3 = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] = lcm(arr[i], arr[i + 1], arr2, arr3);
        }
        return answer;
    }

    private int lcm(int i, int i1, int[] arr, int[] arr2) {
        int count = 0;
        int count2 = 0;
        int result = 0;
        for (int j = 1; j < i; j++) {
            if (i % j == 0) {
                arr[count] = j;
            }
        }
        for (int k = 0; k < i1; k++) {
            if (i1 % k == 0) {
                arr2[count2] = k;
            }
        }
        return count2;
    }
        public static void main (String[]args){
            BigInteger b1 = BigInteger.valueOf(10);
            LCM lcm = new LCM();
            int[] sol = {2, 6, 8, 14};
            lcm.solution(sol);
        }

}