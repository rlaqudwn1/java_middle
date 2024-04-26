package solution;

import java.util.Arrays;
public class MinMax {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();

        String answer = "";
        String[] beforeanswer = s.split(" ");
        s=s.replace(" ", "");
        int[] arr = new int[beforeanswer.length];
        for(int i =0; i<beforeanswer.length; i++){
            arr[i] = Integer.parseInt(beforeanswer[i]);
        }
        Arrays.sort(arr);
        answer=answer.concat(arr[0]+" "+arr[arr.length - 1]);

        return answer;


    }

    public static void main(String[] args) {
        MinMax minMax = new MinMax();
        System.out.println(minMax.solution("4 3 2 1"));
    }
}