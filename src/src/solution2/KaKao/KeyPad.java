package solution2.KaKao;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 1. HashMap에 Key값으로 키패드 1~0까지 넣고 V 값으로 좌표를 넣는다
// 2. Key 값으로 147을 받으면 left를 369를 받으면 right를 answer에 더한다.
// 3. key 값으로 2580을 받으면 좌표를 보고 좌표값을 절댓값으로 left거리 right거리를 비교한다
// 4. 두 거리가 같을 경우 손잡이 방향으로 정한다.
// contains
public class KeyPad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        HashMap<Integer, Integer[]> hashMap = new HashMap<>();
        Integer[][] xy = {{1, 1}, {1, 2}, {1, 3}        //keyPad 좌표
                , {2, 1}, {2, 2}, {2, 3}
                , {3, 1}, {3, 2}, {3, 3}
                , {2, 4}};
        for (int i = 0; i < xy.length; i++) {
            if (i + 1 == 10) {
                hashMap.put(0, xy[i]);
            }else hashMap.put(i + 1, xy[i]);
        }
        for (Integer i : hashMap.keySet()) {
            System.out.print(i+":");
        }
        for (Integer[] value : hashMap.values()) {
            System.out.println(Arrays.toString(value));
        }


        for (int i = 0; i < numbers.length; i++) {

        }

        return answer;
    }

    public static void main(String[] args) {
        KeyPad phoneNumber = new KeyPad();
        int[] phoneNum = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        phoneNumber.solution(phoneNum,"right");
    }
}
