package codingtest_learn.KaKao.Blind2023;

import java.util.HashMap;

/**
 * 1.이모티콘 플러스 가입자를 최대한 늘리면서 판매액 또한 최대로 늘리는게 목적
 * 1-1 이모티콘 플러스 가입자 수가 우선순위 다음에 판매액수에 따라우선순위를 둬 10%,20%,30%,40%할인율로 실행
 *
 * */

public class Emoticon {
    static int[] percent = {10, 20, 30, 40};
    public int[] solution(int[][] users, int[] emoticons) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        BFS(users, emoticons);
        int[] sale = new int[emoticons.length];
        for (int i = 0; i < emoticons.length; i++) {

        }
        int[] answer = new int[2];
        return answer;
    }

    private void BFS(int[][] users, int[] emoticons) {
        boolean[][] invited = new boolean[4][emoticons.length];


    }

    public static void main(String[] args) {
        Emoticon emoticon = new Emoticon();
        int[][] users = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        int[] emoticons = {1300, 1500, 1600, 4900};
        emoticon.solution(users, emoticons);
    }
}
