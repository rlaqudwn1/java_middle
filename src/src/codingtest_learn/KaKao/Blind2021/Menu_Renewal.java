package codingtest_learn.KaKao.Blind2021;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Menu_Renewal {
    public String[] solution(String[] orders, int[] course) {
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] answer = {};
        return answer;
    }
    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};
        Menu_Renewal menuRenewal = new Menu_Renewal();
        menuRenewal.solution(orders, course);
    }
}
