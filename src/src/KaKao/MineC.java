package KaKao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MineC {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        ArrayList<String> strings = new ArrayList<>(List.of(minerals));
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < picks.length; i++) {
            integers.add(picks[i]);
        }
        System.out.println(integers);
        System.out.println(strings);
        strings.remove("diamond");
        strings.remove("diamond");
        strings.remove("diamond");
        strings.remove("diamond");
        System.out.println(strings);
        while (strings.isEmpty() || integers.get(2) == 0) {

        }

        return answer;
    }

    public static void main(String[] args) {
        MineC mine = new MineC();
        String[] minerals = {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
        int[] picks = {1, 3, 2};
        mine.solution(picks, minerals);
    }
}
