package solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Boat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int first=0;
        int last = people.length - 1;
        while (first <= last) {
            if (people[first] + people[last] > limit) {
                last--;
                answer++;
            } else {
                first++;
                last--;
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Boat boat = new Boat();
        int[] people = {70, 60, 80, 40};
        System.out.println(boat.solution(people, 100));
    }
}
