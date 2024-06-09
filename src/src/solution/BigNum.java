package solution;

import java.util.Arrays;
import java.util.Stack;

/**
 * stack을 이용한 풀이
 *
 */
public class BigNum {
    class num {
        int nums=0;
        int count=0;


        public num(int number, int i) {
            this.nums=number;
            this.count=i;
        }
    }
    public int[] solution(int[] numbers) {
        Stack<num> stack = new Stack<>();
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (stack.isEmpty()) {
                stack.add(new num(numbers[i],i));
            } else if (stack.peek().nums < numbers[i]) {
                while ((stack.peek().nums < numbers[i])) {
                    answer[stack.peek().count] = numbers[i];
                    stack.pop();
                    if (stack.isEmpty()) break;
                }
                stack.add(new num(numbers[i],i));
            } else {
                stack.add(new num(numbers[i],i));
            }
        }
        int check2=stack.size();
        for (int i = 0; i < check2; i++) {
            answer[stack.peek().count]=-1;
            stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        BigNum bigNum = new BigNum();
        int[] numbers={9, 1, 5, 3, 6, 2};
        System.out.println(Arrays.toString(bigNum.solution(numbers)));
    }

}
// 실패사례 뒷 큰수를 찾는알고리즘 자체는 맞으나 시간초과로 실패
/*
public int[] solution(int[] numbers) {
    int[] answer = {};
    answer = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
        if (i == numbers.length - 1) {
            answer[i] = -1;
            break;
        }
        answer[i] = findUpperNum(numbers, i);
    }
    return answer;
}

/**
 * 밑에서부터 큰 수를 찾아 넘긴다

private int findUpperNum(int[] numbers, int i) {
    for (int j = i+1; j < numbers.length; j++) {
        if (numbers[i] < numbers[j]) {
            return numbers[j];
        }
    }
    return -1;
}


public static void main(String[] args) {
    int[] answer;
    BigNum bigNum = new BigNum();
    int[] sol = new int[]{9, 1, 5, 3, 6, 2};
    answer=bigNum.solution(sol);
    System.out.println("answer = " + Arrays.toString(answer));
}
*/