package solution;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

public class Correct {
    //큐에 문자열을 차례대로 넣는다
    //첫 큐가 "): 이면 false를 반환한다.
    //첫 큐에 (가 확인되고 다음 문자가 ")" 이면 "("를 poll 한다
    //효율성이 나쁘다..
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