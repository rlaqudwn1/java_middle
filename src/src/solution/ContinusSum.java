package solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ContinusSum {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> integerSet = new HashSet<>();
        //2. 수열의 합을 Set에 저장해 중복을 방지한다
        //3. Set의 사이즈를 result에 반환해 출력한다.

        answer=Sureol(elements, integerSet);
        System.out.println(integerSet);

        return answer;
    }

    private int Sureol(int[] elements, Set<Integer> integerSet1) {
        int result = 0;
        for (int i =1; i <= elements.length; i++) {
            for (int j = 0; j <= elements.length; j++) {
                result=0;
                for (int k = j; k < j + i; k++) {
                    result += elements[k % elements.length];
                }
                integerSet1.add(result);
            }
        }
        return integerSet1.size();
    }

    public static void main(String[] args) {
        ContinusSum continusSum = new ContinusSum();
        int[] ints={7,9,1,1,4};
        System.out.println(continusSum.solution(ints));
    }
}
