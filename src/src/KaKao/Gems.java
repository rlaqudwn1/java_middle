//package KaKao;
//// 2020 카카오 인턴십 보석 쇼핑
//// 보석의 종류를 Set으로 저장
//// two pointer를 이용해 배열을 탐색한다.
//// 2. 보석이 중복될 경우 가장 밑에 있는 보석의 종류와 같으면
//// 3. 모든 보석의 종류가 모였는지 확인하며 다 모이면 end_point+1에서 시작한다.
//// 4. end_point-start_point 를 길이로 길이가 가장 작은 좌표배열을 answer로 출력한다.
//
//// 보석의 종류를 다 모을 때 까지 모든 것을 Hashmap에 저장한다.
//// 다 모았을 경우. 가장 밑에서부터 배열을 삭제해 보고 보석의 value 값이 0 이 되면 좌표를 리턴.
//// 깨지고 다시 모을 수 있는 종류로 보완한다.
//
//
//import java.util.*;
//
//public class Gems {
//    public int[] solution(String[] gems) {
//        // 보석의 종류를 중복없이 Set에 저장
//        int[] answer = {0,0};
//        HashSet<String> gemsset = new HashSet<>(Arrays.asList(gems));
//        ArrayList<Integer> len = new ArrayList<>();
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        int start_point=0;
//        int end_point=0;
//        int lent = 100000;
//        ArrayList<int[]> arrayList = new ArrayList<>();
//        for (int i = 0; i < gems.length; i++) {
//            if (hashMap.containsKey(gems[i])) {
//                hashMap.replace(gems[i], hashMap.get(gems[i]) + 1);
//            } else hashMap.put(gems[i], 1);
//            if (hashMap.size() == gemsset.size()) {// 해쉬맵의 사이즈와 set의 사이즈가 같다면 모든 종류의 보석이 모였다는 뜻
//                end_point = i+1;                   //큐의 사이즈를 끝좌표로 설정
//                while (hashMap.size() == gemsset.size()) {
//                    hashMap.put(gems[start_point], hashMap.get(gems[start_point]) - 1); // 큐의 맨 밑 값으로 hash value -1, 삭제(poll)한다.
//                    if (hashMap.get(g) == 0) {                 //hashMap의 queue의poll값이==0이면 한 종류의 보석의 재고가 없다면
//                            lent = end_point - start_point;
//                            answer[0] = start_point;
//                            answer[1] = end_point;
//                        }
//                        count++;
//                        i=count;
//                        start_point=count+1;
//                        break;
//                    }
//                    start_point++;                                        //보석이 하나 삭제되었으므로 start_point++
//
//                }
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Gems gems = new Gems();
//        String[] gem = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
//        System.out.println(Arrays.toString(gems.solution(gem)));
//    }
//
//}
