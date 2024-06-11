package codingtest_learn.KaKao.Blind2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 1. HashMap을 이용해 유저 아이디와 닉네임을 K,v값으로 저장한다.
 * 2. 변경된 닉네임을 확인하고 K,V를 조정한다.
 * 3. 배열을 읽어들이며 Enter Leave를 판단하여 들어오고 나감을 출력한다.
 */

public class Open_Chat {
    public ArrayList<String> solution(String[] record) {
        HashMap<String, String> hashMap = new HashMap<>();
        int count=0;
        // Enter를 기점으로 유저 아이디와 닉네임을 hashMap에 저장하고
        // Change를 통해 K,V값을 조정한다.
        for (int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            if (info[0].equals("Enter")) {
                hashMap.put(info[1], info[2]);
            } else if (info[0].equals("Change")) {
                hashMap.put(info[1], info[2]);
            } else if (info[0].equals("Leave"))count++;
        }
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            if (info[0].equals("Enter")) {
                answer.add(hashMap.get(info[1]) + "님이 들어왔습니다.");
            } else if (info[0].equals("Leave")) {
                answer.add(hashMap.get(info[1]) + "님이 나갔습니다.");
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Open_Chat openChat = new Open_Chat();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        openChat.solution(record);
    }
}
