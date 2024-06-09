package codingtest_learn.solution2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class SlidingWindow {
    static int myArr[];
    static int checkArr[];
    static int checkSecret;
    private static void Add(char c) {
        switch (c) {
            case 'A' -> {
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            }
            case 'C' -> {
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;

            }
            case 'G' -> {
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            }
            case 'T' -> {
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
            }
        }

    }
    private static void Remove(char c) {
        switch (c) {
            case 'A' -> {
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            }
            case 'C' -> {
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]++;
                break;

            }
            case 'G' -> {
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]++;
                break;
            }
            case 'T' -> {
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]++;
                break;
            }
        }
    }
        public static void main (String[]args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int dna = Integer.parseInt(stringTokenizer.nextToken());
            int split = Integer.parseInt(stringTokenizer.nextToken());
            checkArr = new int[4];
            myArr = new int[4];
            checkSecret = 0;
            int result = 0;
            char A[] = new char[dna];
            A = bufferedReader.readLine().toCharArray();
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < 4; i++) {
                checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
                if (checkArr[i] == 0) {
                    checkSecret++;
                }
            }
            for (int i = 0; i < split; i++) { //부분문자열 처음 받을 때 세팅
                Add(A[i]);
            }
            if (checkSecret == 4) result++;

            //슬라이딩윈도우
            for (int i = split; i < dna; i++) {
                int j = i - split;
                Add(A[i]);
                Remove(A[j]);
                if (checkSecret == 4) result++;
            }
            System.out.println(result);
            bufferedReader.close();
        }
    }

