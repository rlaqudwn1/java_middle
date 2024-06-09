package codingtest_learn.solution2;

import java.util.*;

/**
 * 시소 문제
 */
public class Seesaw {
    public long solution(int[] weights) {
        Set<long[]> set = new HashSet<>();
        for (int i = 0; i < weights.length-1; i++) {
            for (int j = i+1; j < weights.length; j++) {
                if (weights[i] == weights[j] || weights[i] * 1.5 == weights[j] || weights[i] * 2 == weights[j]||weights[i]*3/4==weights[j]) {
                    set.add(new long[]{weights[i], weights[j]});
                }
            }
        }
        long answer = 0;
        answer = set.size();
        return answer;
    }
    public static void main(String[] args) {
        Seesaw seesaw = new Seesaw();
        int[] weights = {100, 180, 360, 100, 270};
        seesaw.solution(weights);
    }
}

/**
 * public long codingtest_learn.solution(int[] weights) {
 *     	long answer = 0;
 *         Arrays.sort(weights);
 *         Map<Double, Integer> map = new HashMap<>();
 *         for(int i : weights) {
 *     		double a = i*1.0;
 *     		double b = (i*2.0)/3.0;
 *     		double c = (i*1.0)/2.0;
 *     		double d = (i*3.0)/4.0;
 *     		if(map.containsKey(a)) answer += map.get(a);
 *     		if(map.containsKey(b)) answer += map.get(b);
 *     		if(map.containsKey(c)) answer += map.get(c);
 *     		if(map.containsKey(d)) answer += map.get(d);
 *     		map.put((i*1.0), map.getOrDefault((i*1.0), 0)+1);
 *         }
 *
 *         return answer;
 *     }
 */