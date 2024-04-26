package solution;

import java.util.Arrays;
import java.util.Vector;

public class BinaryConverion {
    int[] answer = {0, 0};

    public int[] solution(String s) {
        String strings = "";
        String asd = "";


        while (!s.equals("1")) {
            String[] a = s.split("0");
            String[] b = s.split("1");
            for (String string : a) {
                strings+=string;
            }
            for (String string : b) {
                asd += string;
            }
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        System.out.println(strings);
        answer[1] += asd.length();
        return answer;
    }


    public static void main(String[] args) {
        BinaryConverion binaryConverion = new BinaryConverion();
        System.out.println(Arrays.toString(binaryConverion.solution("110010101001")));
    }
}
