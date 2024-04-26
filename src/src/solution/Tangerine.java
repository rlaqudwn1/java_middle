package solution;

import collection.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class Tangerine {
    public int solution(int k, int[] tangerine) {
        /**
         * 1. Hashmap에 Key:숫자 Value:개수 로 저장한다.
         * 2. Value 값을 배열에 저장해 내림차순으로 저장한다.
         * 3. for:each문으로 큰수부터 k-Value를 수행한다.
         * 4. 한번 수행할 때마다 answer에 +1, k가 <=0일 경우 return
         */
        int answer=0;
//        1. HashMap에 Key Value 값을 저장
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            if (map.get(i) != null) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        Vector<Integer> integerVector = new Vector<>();
        integerVector.addAll(map.values());

        Collections.sort(integerVector, Collections.reverseOrder());// 내림차순 정렬
        for (Integer integer : integerVector) {
            answer++;
            k=k-integer;
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Tangerine tangerine = new Tangerine();
        int[] sol = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(tangerine.solution(6, sol));
    }
}
