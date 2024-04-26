package solution;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    static Time[] times;
    static int s;
    static int[] ch;

    public int solution(String[][] book_time) {
        s = book_time.length;
        ch = new int[s];
        int answer = 0;
        times = new Time[s];
        for (int i = 0; i < s; i++) {
            int a = Integer.parseInt(book_time[i][0].replace(":", ""));
            int b = Integer.parseInt(book_time[i][1].replace(":", ""));
            times[i] = new Time(a, b);
            System.out.println(times);


        }
        return answer;
    }

    class Time implements Comparable<Time> {
    int x,y;

        public Time(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Time o) {
            return 0;

        }
    }

    public static void main(String[] args) {
        
    }
}
