package codingtest_learn.solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Mapping {
    public int solution(String str, char t) {
        int answer=0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        System.out.println("str = " + str+t);
        for (char x : str.toCharArray()) {
            if (x==t) answer++;

        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t)
                answer+=1;
        }
        return answer;
    }
    public static void main(String[] args) {
        StringBuilder test = new StringBuilder("good");
        System.out.println(test.reverse());
        String test1 = "good";
        StringBuilder test2 = new StringBuilder(test1);
        System.out.println(test2.reverse());
        Mapping T = new Mapping();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(T.solution(str,c));

    }
}
