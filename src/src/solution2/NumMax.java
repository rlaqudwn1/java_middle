package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nArr = new int[]{sc.nextInt()};
        int sum=0;
        for (int i : nArr) {
            sum += i;
        }
        Arrays.sort(nArr);
        System.out.println(nArr[0]);
        System.out.println(sum*100/nArr[nArr.length-1]/n);
    }
}
