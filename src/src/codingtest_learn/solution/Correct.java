package codingtest_learn.solution;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

/**
 * 올바른 괄호찾기
 * 모든 문자열이 인식되면서 모든 괄호가 올바른 괄호이면 마지막괄호에서부터 다 풀어져야하기 때문에
 * 스택으로 들어올 문자를 위에서부터 확인하면서 계산하는 문자열의 개수를 줄인다.
 *
 */

public class Correct {

    boolean solution(String s) {
        boolean answer = true;
        String[] strings = s.split("");
        Stack<Character> characterStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                characterStack.add(c);
            } else if (characterStack.isEmpty() || characterStack.pop()!='(') {
                return false;
            }
        }
        if (characterStack.isEmpty()) {
            return  true;
        }else return false;
    }

    public static void main(String[] args) {
        Correct correct = new Correct();
        System.out.println(correct.solution("(()))"));
    }

}
/**
 * 큐에 문자열을 차례대로 넣는다
 * 첫 큐가 "): 이면 false를 반환한다.
 * 첫 큐에 (가 확인되고 다음 문자가 ")" 이면 "("를 poll 한다
 * 효율성이 나쁘다..
 */


//        for (String string : strings) {
//            if (stringQueue.isEmpty()) {
//                stringQueue.offer(string);
//            } else if (stringQueue.peek().equals(")")) {
//                answer = false;
//                return answer;
//            } else if (string.equals(")")) {
//                stringQueue.poll();
//            } else stringQueue.offer(string);
//        }

//        for (String string : strings) {
//            if (stringQueue.isEmpty()) {
//                stringQueue.offer(string);
//            } else if (stringQueue.peek().equals(")")) {
//                answer = false;
//                return answer;
//            } else if (string.equals(")")) {
//                stringQueue.poll();
//            } else stringQueue.offer(string);
//        }