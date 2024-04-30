package solution2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ju {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        int[] a = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i <N; i++) {
            a[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(a);

        int start_index =0; // MIN
        int end_index = a.length-1; // MAX
        int sum=0;
        int count=0;
        while (start_index < end_index) {
            if (a[start_index]+a[end_index] < M) {
                start_index++;
            } else if (a[start_index] + a[end_index] > M) {
                end_index--;
            } else {
                count++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(count);
    }
}
