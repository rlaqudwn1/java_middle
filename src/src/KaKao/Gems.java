package KaKao;
// 2020 카카오 인턴십 보석 쇼핑
// 보석의 종류를 Set으로 저장
// two pointer를 이용해 배열을 탐색한다.
// 1. 보석의 종류를 차례대로 Queue에 넣는다
// 2. 보석이 중복될 경우 가장 밑에 있는 보석의 종류와 같으면 poll한다.
// 3. 모든 보석의 종류가 모였는지 확인하며 다 모이면 end_point+1에서 시작한다.
// 4. end_point-start_point 를 길이로 길이가 가장 작은 좌표배열을 answer로 출력한다.
// 보석의 종류를 다 모을 때 까지 모든 것을 Hashmap에 저장한다.
// 다 모았을 경우. 가장 밑에서부터 배열을 삭제해 보고 보석의 종류가 깨지는지 확인하며
// 보석을 다모으는 한 구간을 지난 후 그 다음 구간부터 다시 찾기 시작한다.


import java.util.*;

public class Gems {
    public int[] solution(String[] gems) {
        // 보석의 종류를 중복없이 Set에 저장
        HashSet<String> gemsset = new HashSet<>(Arrays.asList(gems));
        System.out.println(gemsset.toString());
        Queue<String> queue = new LinkedList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int start_point=0;
        int end_point=0;
        for (int i = 0; i < gems.length; i++) {
            queue.add(gems[i]);
            if (hashMap.containsKey(gems[i])) {
                hashMap.replace(gems[i],hashMap.get(gems[i])+1);
            }else hashMap.put(gems[i],1);
            if (hashMap.keySet().equals(gemsset.iterator())) {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(hashMap.keySet().toArray()));
        System.out.println(queue);
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Gems gems = new Gems();
        String[] gem = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        gems.solution(gem);
    }

}
