package codingtest_learn.solution;

import java.util.HashMap;

public class Cake {
    //HashMap을 K숫자,V개수 로 저장한다
    // K값의 개수를 구하고 K를 2개로 나누는 방법이 뭐였지?
    // K를 2로 나눠 떨어지는가 그 다음 몫을 하면 되나?
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : topping) {
            if (map.get(i) != null) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i,1);
            }
        }
        if (map.size()%2==0) {
            return answer=map.size()/2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Cake cake = new Cake();
        int[] caketoping ={1, 2, 1, 3, 1, 4, 1, 2};
    }

}
