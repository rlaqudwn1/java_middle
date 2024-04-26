package solution;

import java.util.Stack;

public class SubString {
    public int solution(String s) {
        int answer =0;
        String [] strings =s.split("");
        Stack<String> stringStack = new Stack<>();
        for (String string : strings) {
            if (!stringStack.isEmpty() && stringStack.peek().equals(string)) {
                stringStack.pop();
            } else {
                stringStack.push(string);
            }
        }
        if (stringStack.isEmpty()) {
            answer=1;
        }

        return answer;
    }

    public static void main(String[] args) {
        SubString subString = new SubString();
        String a = "baabaa";
        System.out.println(subString.solution(a));

    }
}
