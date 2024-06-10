package codingtest_learn.KaKao.Blind2018;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * 1. 셔틀은 9:00부터 t분당 n회 에 출발하므로 9:00+(t*n)회의 m번째 마지막 탑승자가 되도록 한다.
 * 1-1 9:00+(t*n)분의 버스를 타기 위해선 9:00(t*n)-t+1(마지막 전 버스의 시간+1) 시간대의 마지막 탑승자가 되어야 한다.
 * 1-2 시간대를 분으로 치환하고 오름차순으로 정렬한다.
 * 1-3 버스 시간대에 맞게 사람을 순차적으로 내보낸다.
 * 2 마지막 버스 시간대의 좌석 수보다 시간대에 맞는 대기자가 많을 경우 마지막 대기자시간보다 1분 빨리 도착한 시간을 return한다.
 *
 */
public class KaKaoBus {
    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        int bus_time = 540; // 첫 버스 시간 09:00 -> 540분
        int end_bus_time= bus_time+n*t; // 마지막 버스 시간
        int max_person = timetable.length;
        int count=0;
        int[] time_int = new int[timetable.length];
        for (int i = 0; i < timetable.length; i++) {
            String[] times = timetable[i].split(":");
            time_int[i] = Integer.parseInt(times[0])*60 + Integer.parseInt(times[1]);
        }
        Arrays.sort(time_int);
        ArrayList<Integer> integers = new ArrayList<>();//버스 시간배열
        // 마지막 버스시간보다 큰 시간은 제외된다.
        for (int i : time_int) {
            integers.add(i);
        }

        //버스 마지막 전시간까지 대기자 처리.
        if (n > 1) {
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < m; j++) {
                    if (bus_time >= integers.get(0)) {
                        count= integers.get(0);
                        max_person--;
                        integers.remove(0);
                        if (max_person == 0) {
                            return timeset(count-1);
                        }
                    }
                }
                bus_time+=t;
            }
        }
        // 버스 마지막시간 처리
        for (int k = 0; k < m; k++) {
            int seat=m;    // 좌석 수seat 마지막 버스시간에 좌석 수 보다 많을 경우 마지막 대기자보다 1분 빨리 도착한다.
            if (bus_time >= integers.get(0)) {
                count= integers.get(0);
                max_person--;
                integers.remove(0);
                seat--;
            }
            if (seat <= 0) {
                return timeset(count - 1);
            }
            if (max_person == 0&& k+1<m) {
                return timeset(bus_time);
            } else if (max_person==0) {
                return timeset(count-1);
            }

        }
        if (integers.get(0) > bus_time) {
            return timeset(bus_time);
        }
        if (max_person > 0) {
            return timeset(count - 1);
        }
        return timeset(bus_time);
    }
    private String timeset(int end_time) {
        String answer = "";
        int time = end_time / 60;
        int min = end_time % 60;
        if (time < 10) {
            answer += "0" + time + ":";
        } else answer += time + ":";
        if (min < 10) {
            answer += "0" + min;
        }else answer+=min;
        return answer;
    }

    public static void main(String[] args) {
        KaKaoBus kaKaoBus = new KaKaoBus();
        int n =1;
        int t =1;
        int m =1;
        String[] timetable = {"09:00", "09:05"};
        System.out.println(kaKaoBus.solution(n, t, m, timetable));
    }
}
