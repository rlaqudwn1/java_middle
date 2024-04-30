package solution;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums=0;
        nums = scanner.nextInt();
        String sNum = scanner.next();
        char[] str = sNum.toCharArray();
        System.out.println(str.length);
        int sum=0;
        for (int i = 0; i < str.length; i++) {
            sum += str[i] - 48;
            System.out.println(sum);
        }
    }
}
