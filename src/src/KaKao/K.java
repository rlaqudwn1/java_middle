package KaKao;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. n 을 k진수로 변환한다.
 * 2. k진수로 변환한 값을 0을 기준으로 split
 * 3. 그 수가 10진수로 소수인지 판단하고 소수의 개수를 리턴
 */

public class K {
    public int solution(int n, int k) {
        int answer = 0;
        boolean tr =true;
        ArrayList<Long> nlist = new ArrayList<>();
        String[] kn;
        kn = Integer.toString(n,k).split("0");
        for (String s : kn) {
            if (!s.isEmpty()) {
                nlist.add(Long.parseLong(s));
            }
        }
        for (Long i : nlist) {
            tr=true;
            if (i == 2) {
                tr = true;
            } else if (i == 1) {
                tr = false;
            } else {
                long s= (long) Math.sqrt(i)+1;
                for (int j = 2; j < s; j++) {
                    if (i % j == 0) {
                        tr = false;
                        break;
                    }
                }
            }
            if (tr) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        K k = new K();
        System.out.println(k.solution(437674, 3));
    }
}
