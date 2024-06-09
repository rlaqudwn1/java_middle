package codingtest_learn.KaKao;

import java.util.*;

/**
 * 1. records를 공백을 기준으로 split
 * 2. 주차 요금체계 확립
 * ex) 기본요금 + ({분-기본시간 }/단위 시간)올림celing*요금 원
 * ex) fees[1]+(주차시간-fees[0])/fees[2])올림*fees[3]
 * 3. record의 주차 번호에 따라 IN OUT 계산
 * 3-1 차량 번호가 한번 입력되면 In 두번입력은 OUT 으로 간주하고 그 시간을 배열에 따로 저장한다.
 * 3-2 In OUT의 순서에 따라 시간배열에서 2-ex 실행
 * 3-3. In만 있고 OUT이 없으면 23:59에 퇴실로 간주
 * 4. 차량번호가 작은 순서대로 주차요금을 배열에 담아서 return
 */

public class Parking {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> remap = new HashMap<>();
        Map<String, Integer> map = new HashMap<>();

        int end_time = 23*60+59;
        ArrayList<String[]> park = new ArrayList<>();
        int[] time = new int[records.length];
        for (int i = 0; i < records.length; i++) {
            park.add(records[i].split(" "));
            time[i] = Integer.parseInt(records[i].substring(0, 2)) * 60;
            time[i] += Integer.parseInt(records[i].substring(3, 5));
        }
        for (String[] strings : park) {
            map.put(strings[1], 0);
        }
        for (int i = 0; i < park.size(); i++) {
            if (remap.containsKey(park.get(i)[1])) {
                map.put(park.get(i)[1], map.get(park.get(i)[1])+time[i] - remap.get(park.get(i)[1]));
                remap.remove(park.get(i)[1]);
            } else remap.put(park.get(i)[1],time[i]);
        }
        String[] keymap = remap.keySet().toArray(new String[0]);
        for (String string : keymap) {
            map.put(string, map.get(string) + end_time - remap.get(string));
        }
        for (String s : map.keySet()) {
            map.put(s, (int) (fees[1] +((Math.ceil((double) (map.get(s) - fees[0]) / fees[2]) * fees[3]))));
        }
        String[] end = map.keySet().toArray(new String[0]);
        Arrays.sort(end);
        int[] answer = new int[map.size()];
        for (int i = 0; i < answer.length; i++) {
            if (map.get(end[i]) < fees[1]) {
                answer[i] = fees[1];
            }else answer[i] = map.get(end[i]);
        }

//        * ex) 기본요금 + ({분-기본시간 }/단위 시간)올림celing*요금 원
//                * ex) fees[1]+(주차시간-fees[0])/fees[2])올림*fees[3]
        return answer;
    }

    public static void main(String[] args) {
        Parking parking = new Parking();
        int[] fees = {180, 5000, 10, 600};
        String[] recods = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(Arrays.toString(parking.solution(fees, recods)));
    }
}
