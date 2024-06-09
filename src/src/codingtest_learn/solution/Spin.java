package codingtest_learn.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Spin {
    public int solution(String s) {
        String[] strings = s.split("");
        Queue<String> queue = new LinkedList<>(Arrays.asList(strings));
        System.out.println(queue);
        int answer = -1;
        return answer;
        //"[" 가 나왔을 경우 })가 나오면 fail 반대로 "}",")"도 동일하다
        //"["안에 "{""("이 나왔으면 나중에 나온 순 대로 ")","}","]"이 나와야 하며 순서대로 나오지 않으면 fail
        // 를 알고리즘으로 하려면 어떻게 하죠??

    }
    public static void main(String[] args) {
        Spin spin = new Spin();
        String spinnow = "[](){}";
        spin.solution(spinnow);

    }
}
