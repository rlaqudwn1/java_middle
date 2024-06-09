package codingtest_learn.KaKao.Internship2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 1. 보석의 종류를 set으로 중복없이 저장한다.
 * 2. HashMap에 K: 보석이름 V: 갯수를 저장한다.
 * 2-1 투 포인터로 0~보석의 총 갯수까지 보석의 종류가 다 모일 때 까지 end_point를 확장한다.
 * 2-2 HashMap size가 Set에 size와 같다면 모든 보석의 종류가 다 모인 것
 * 3. start_point를 이용해 모든 보석이 모인 최단 길이를 구한다.
 * 3-1 start_point에 있는 보석을 K값에서 찾아 V값을 -1한다.
 * 3-2 만약 K보석의 V값이 0 이되면 모든 보석의 종류가 모인게 아니므로 좌표를 answer에 넣고 그 K를 HashMap에서 삭제한다.
 * 4. gems의 모든 배열이 끝날 때 가지 반복하며 가장 짧은 길이와 시작 숫자가 가장 작은 좌표를 구해 answer를 return.
 */
public class Gems {
    public int[] solution(String[] gems) {
        // 보석의 종류를 중복없이 Set에 저장
        int[] answer = {0,0};
        HashSet<String> gemsset = new HashSet<>(Arrays.asList(gems));           //보석의 종류를 Set에 중복없이 저장한다.
        ArrayList<Integer> len = new ArrayList<>();                             //
        HashMap<String, Integer> hashMap = new HashMap<>();                     //
        int start_point=0;
        int end_point=0;
        int lent = 100000;
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int i = 0; i < gems.length; i++) {
            if (hashMap.containsKey(gems[i])) {                                 //중복되는 값이 있으면 보석의 보석의 수를 +1
                hashMap.replace(gems[i], hashMap.get(gems[i]) + 1);
            } else hashMap.put(gems[i], 1);

            if (hashMap.size() == gemsset.size()) {// 해쉬맵의 사이즈와 set의 사이즈가 같다면 모든 종류의 보석이 모였다는 뜻
                end_point = i+1;                   //큐의 사이즈를 끝좌표로 설정
                while (hashMap.size()==gemsset.size()) {
                    hashMap.put(gems[start_point], hashMap.get(gems[start_point]) - 1); // 큐의 맨 밑 값으로 hash value -1
                    if (hashMap.get(gems[start_point]) == 0) {                 //hashMap의 queue의poll값이==0이면 한 종류의 보석의 재고가 없을 경우
                        if (lent > end_point - start_point) {
                            lent = Math.min(lent, end_point - start_point);     //작은 길이의 좌표를 answer에 저장
                            answer[0] = start_point+1;
                            answer[1] = end_point;
                        } else if (lent==end_point-start_point) {
                            if (answer[0] > start_point) {
                                answer[0]=start_point+1;
                                answer[1]=end_point;
                            }
                        }
                        hashMap.remove(gems[start_point]);
                    }
                    start_point++;
                }
                                                        //보석이 하나 삭제되었으므로 start_point++

            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Gems gems = new Gems();
        String[] gemss = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        System.out.println(Arrays.toString(gems.solution(gemss)));
    }
}
