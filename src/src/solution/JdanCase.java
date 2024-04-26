package solution;

import java.util.ArrayList;
import java.util.Arrays;

public class JdanCase {
    //공백이 연속으로 나오는 경우 대응
    public String solution(String s) {
        String answer="";
        StringBuilder sb = new StringBuilder();

        String[] arr = s.split(" ");
        for (String string : arr) {
            if (string=="") {
                System.out.println("null");
            }
            Character c=string.charAt(0);
            if (!(0 < c && c < 10)) {
                c=Character.toUpperCase(c);
                string=string.substring(1);
                System.out.println(string);
            }
        }
//        for (String string : arr) {
//            Character a = string.charAt(0);
//            if (97 <= a || a<= 172) {
//                a = Character.toUpperCase(a);
//                String sub = string.substring(1).toLowerCase();
//                sb.append(a).append(sub).append(" ");
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        JdanCase jdanCase = new JdanCase();
        jdanCase.solution("for  the people");
    }
}
