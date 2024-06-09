package codingtest_learn.solution;

import java.util.Arrays;

public class LastLang {
    public int[] solution(int n, String[] words) {
        int count=1;
        int[] answer = {2,1};
        for (int i = 1; i < words.length; i++) {
            if (answer[0] > n) {
                answer[1]++;
                answer[0]=1;
            }
            for (int j = i-1; j >= 0; j--) {
                if (i >= 1&&words[j].equals(words[i])) {
                    return answer;
                }
            }
            if (words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)) {
                answer[0]++;    //끝말잇기
                System.out.println(Arrays.toString(answer));
            } else {
                return answer;
            }

        }
        for (int i = 0; i < words.length-2; i++) {
            if (words[words.length - 1].equals(words[i])) {
                return answer;
            }
        }
        answer[0]=0;
        answer[1]=0;
        return answer;
    }
    public static void main(String[] args) {
        LastLang lastLang = new LastLang();
        String[] wd = {"tank", "kick", "know", "kick"};

        System.out.println(Arrays.toString(lastLang.solution(3, wd)));
    }
}
