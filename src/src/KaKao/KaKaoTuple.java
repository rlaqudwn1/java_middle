package KaKao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// {a1}, {a1,a2} {a1,a2,a3},{a1,a2,a3,a4...an} 이 규칙으로 생성된 튜플 문자열이 주어진다.
// 튜플이 {a1}, {a1,a2} {a1,a2,a3} 길이가 작은 문자열에서부터 하나씩 들어가 튜플 모든 원소가 나타난다.
// 길이가 작은 문자열에서부터 발견되지 않는 문자를 찾아내 answer에 담는다.
// 중복되지 않는 문자는 set을 사용하여 저장한다.
// 저장한 것을 인트배열로 변환하여 출력.
public class KaKaoTuple {
    public int[] solution(String s) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        //1 글자 파싱하기
        String[] split = s.split("\\},\\{"); // {}를 \\이스케이프하여 split해 배열에 저장"
        // 배열의 맨앞 맨뒤 문자열의 {}제거
        split[0] = split[0].replaceAll("[{}]", "");
        split[split.length-1] = split[split.length-1].replaceAll("[{}]", "");//
        // 길이가 짧은 순으로 array 정렬
        String[][] sortStr = new String[split.length][];

        for (String string : split) {
            String[] ss = string.split(",");
            sortStr[ss.length - 1] = ss;   //원소의 개수가 배열의 길이와 같으므로 ss.length에 -1을 주소로 ss를 저장
        }
        //[["a1"]]
        //[["a1"],[a1,a2]]
        //[["a1"],[a1,a2],[a1,a2,an]] 과 같이 나눠진다.

        //set을 사용해 중복되지 않는 요소를 받는다
        String[] stringArr = new String[sortStr.length];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < sortStr.length; i++) {
            for (int j = 0; j <sortStr[i].length; j++) {
                if (!set.contains(sortStr[i][j])) {
                    stringArr[i] = sortStr[i][j];
                    set.add(sortStr[i][j]);
                }
            }
        }
        int[] answer = new int[sortStr.length];
        for (int i = 0; i < sortStr.length; i++) {
            answer[i] = Integer.parseInt(stringArr[i]);
        }
        System.out.println(Arrays.toString(answer));

    }
}

