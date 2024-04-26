package programmers_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Hotel {
    public int solution(String[][] book_time) {
        int answer = 0;
        int book = book_time.length;

        return answer;
    }

    public static void main(String[] args) {
        String[][] book_time = new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
        int hotellen = book_time.length;
        int[][] list_Num = new int[hotellen][2];
        for (int i = 0; i < hotellen; i++) {
            int start_time = Integer.parseInt(book_time[i][0].replace(":", ""));
            int end_time = Integer.parseInt(book_time[i][1].replace(":", ""));
            list_Num[i][0]=start_time;
            list_Num[i][1]=end_time;

            end_time += 10;
            if (end_time % 100 >= 60) {
                end_time += 40;

            }
        }

        Arrays.sort(list_Num);
        for (int[] ints : list_Num) {
            System.out.println(Arrays.toString(ints));

        }
        if (list_Num[0][1] >= list_Num[1][0]) {
            System.out.println("T");
        }




    }
}