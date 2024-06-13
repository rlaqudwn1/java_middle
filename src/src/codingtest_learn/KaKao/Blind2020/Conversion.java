package codingtest_learn.KaKao.Blind2020;

import java.util.Stack;

/**
 * 구현문제 재귀함수
 * 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
 * 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
 * 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
 *   3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
 * 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
 *   4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
 *   4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
 *   4-3. ')'를 다시 붙입니다.
 *   4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
 *   4-5. 생성된 문자열을 반환합니다.
 */
public class Conversion {
    public String solution(String p) {
        String answer = "";
        //        ex) 이미 문자열이 올바른 괄호 문자열이면 반환한다.
        if (find_correct_String(p)) {
            return p;
        }
        answer+=sol(p);


        return answer;
    }

    private String sol(String p) {
        //1.
        StringBuilder u = new StringBuilder();
        String v = "";
        StringBuilder sb = new StringBuilder();
        if (p.isEmpty()) return p;
        //2.
        int s1 =0;
        int s2= 0;
        for (int i = 0; i < p.length(); i++) {
            if (String.valueOf(p.charAt(i)).equals("(")) {
                s1++;
                u.append("(");
            } else {
                s2++;
                u.append(")");
            }
            if (s1 != 0 && s1 == s2) {
                v = p.substring(i+1);
                break;
            }
        }
        if (find_correct_String(u.toString())) {
            sb.append(u).append(sol(v));
        } else {
            sb.append("(").append(sol(v)).append(")").append(reverse(u.toString()));
        }
        return sb.toString();
    }

    private StringBuilder reverse(String u) {
        StringBuilder sb = new StringBuilder();
        u = u.substring(1, u.length() - 1);
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') {
                sb.append(')');
            } else sb.append('(');
        }
        return sb;
    }
    //올바른 괄호 문자열
    private boolean find_correct_String(String w) {
        Stack<Character> stack = new Stack<>();
        if (w.isEmpty()) {
            return false;
        }
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(()())()";
        Conversion conversion = new Conversion();
        System.out.println(conversion.solution(s));

    }
}
