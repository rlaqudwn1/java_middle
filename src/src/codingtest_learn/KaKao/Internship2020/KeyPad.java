package codingtest_learn.KaKao.Internship2020;

import java.util.HashMap;

// 1. HashMap에 Key값으로 키패드 1~0까지 넣고 V 값으로 좌표를 넣는다
// 2. Key 값으로 147을 받으면 left를 369를 받으면 right를 answer에 더한다.
// 3. key 값으로 2580을 받으면 좌표를 보고 좌표값을 절댓값으로 left거리 right거리를 비교한다
// 4. 두 거리가 같을 경우 손잡이 방향으로 정한다.
// contains
public class KeyPad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        HashMap<Integer, Integer[]> hashMap = new HashMap<>();
        int lenL = 0;                   //왼손의 거리
        int lenR = 0;                   //오른손의 거리
        Integer[] leftxy ={1,4};        //초기 왼손*좌표
        Integer[] rightxy ={3,4};       //초기 오른손#좌표
        Integer[][] xy = {{1, 1}, {2, 1}, {3, 1}       //keyPad 좌표
                , {1, 2}, {2, 2}, {3, 2}
                , {1, 3}, {2, 3}, {3, 3}
                , {2, 4}};
        // hashMap에 K:키패드 번호와 V: 좌표배열을 넣는다.
        for (int i = 0; i < xy.length; i++) {
            if (i + 1 == 10) {
                hashMap.put(0, xy[i]);
            }else hashMap.put(i + 1, xy[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            lenL=0;
            lenR=0;
            // 1,4,7인 경우 answer에 L을 넣고 왼손 좌표에 키패드 좌표를 넣는다.
            if ((numbers[i] == 1) || (numbers[i] == 4) || (numbers[i] == 7)) {
                answer += "L";
                leftxy=hashMap.get(numbers[i]);
            }
            // 3,6,9인 경우 answer에 R을 넣고 오른손 좌표에 키패드 좌표를 넣는다.
            if ((numbers[i] == 3) || (numbers[i] == 6) || (numbers[i] == 9)) {
                answer += "R";
                rightxy=hashMap.get(numbers[i]);
            }
            // 2,5,8,0 인 경우 2,5,8,0의 좌표와 왼손 오른손 좌표를 통해 절댓값으로 길이를 구한다.
            if ((numbers[i] == 2) || (numbers[i] == 5) || (numbers[i] == 8) || (numbers[i] == 0)) {
                lenL += Math.abs(leftxy[0] - hashMap.get(numbers[i])[0]);
                lenL += Math.abs(leftxy[1] - hashMap.get(numbers[i])[1]);
                lenR += Math.abs(rightxy[0] - hashMap.get(numbers[i])[0]);
                lenR += Math.abs(rightxy[1] - hashMap.get(numbers[i])[1]);
                // 길이가 작은 쪽을 출력하나 같으면 손잡이 방향에 따라 출력하고 키패드 좌표를 받는다.
                if (lenL > lenR) {
                    answer += "R";
                    rightxy=hashMap.get(numbers[i]);
                } else if (lenL < lenR) {
                    answer += "L";
                    leftxy=hashMap.get(numbers[i]);
                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        rightxy=hashMap.get(numbers[i]);
                    } else if (hand.equals("left")){
                        answer += "L";
                        leftxy=hashMap.get(numbers[i]);
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        KeyPad phoneNumber = new KeyPad();
        int[] phoneNum = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        System.out.println(phoneNumber.solution(phoneNum, "right"));
    }
}
