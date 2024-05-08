package KaKao;


//1사전에 AtoZ가 1~26까지 저장되어 있다.
//2사전에 들어있는 단어를 찾으면 다음 문자를 넣고 사전에 단어가 있는지 찾는다
//3그 단어가 없다면 맨마지막 번호에+1해 새단어를 넣는다.
//3.5 단어를 찾으면 단어 다음 문자부터 2~3을 반복한다.
// 모든 단어를 찾은 다음 그 단어를 통해 딜이가 긴 순서부터 startwith와 substring으로제거해가며 strings의 길이가 0이되면 answer를 출력한다.

//색인 번호 출력

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * two 포인터 활용안// 폐지
 * 1.start 인덱스 end인덱스로 사전에 있는 단어이면 endindex에 +1하고 문자를 추가하고
 * 2. 추가한 문자열이 사전에 없으면 start_index에 endindex+1을 추가
 * 3. 다음 문자열은 startindex에서
 */
//4그 다음 문자가 단어에 있는지 찾고 2~3번을 반복한다.
//문자열 압축이 끝나고 모든 색인번호를 배열로 출력한다..


public class KaKaocompress {
    public int[] solution(String msg) {
        boolean contain=false;
        String[] strings = msg.split("");
        int start_index=0;
        int end_index = 0;
        int count=26;
        String firstString = strings[0];
        String secondString = strings[0];
        HashMap<String, Integer> comp = new HashMap<>();
        ArrayList<Integer> answerset = new ArrayList<>();

        //HashMap 사전에 A=1부터 Z26까지 저장한다.

        for (int i = 0; i < 26; i++) {
            comp.put(String.valueOf((char)('A'+i)), i + 1);
        }
        StringBuilder baseNum = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            baseNum.append(strings[i]);
            if (!comp.containsKey(baseNum.toString())) {
                count++;
                comp.put(baseNum.toString(), count); // 사전추가
                baseNum = new StringBuilder(strings[i]); // baseNum 초기화
                answerset.add(comp.get(baseNum.toString())); //answer에 마지막 단어를 넣는다.
            } else {
                if (!answerset.isEmpty()){answerset.removeLast();}
                answerset.add(comp.get(baseNum.toString()));
            }
        }
        int[] answer = new int[answerset.size()];
        for (int i = 0; i < answerset.size(); i++) {
            answer[i] = answerset.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        KaKaocompress kaKaocompress = new KaKaocompress();
        System.out.println(Arrays.toString(kaKaocompress.solution("KAKAO")));
    }
}
