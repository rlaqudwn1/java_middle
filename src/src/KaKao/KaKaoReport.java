package KaKao;


import java.util.*;

/**
 * 1. 각 유저는 한번에 한명의 유저를 신고할 수 있다.
 * 1-1 단 다른 유저는 계속 신고할 수 있으나 중복은 1회로 처리한다
 * ex) 한 유저에 대한 중복 신고를 boolean 으로 true false 한다
 * ex) HashMap으로 K: UserName V: reportName으로 진행
 * ex2) report에서 " "으로 신고자와 피신고자를 구별할 수 있으므로 split을 이용해 구별
 * ex3) K: muzi V:fordo neo 식으로 구별할 수 있도록 구현
 * ex3-1) 한 유저의 처음 신고는 contains key로 식별하며 다음 신고는 " "를 넣으며 split 구별자를 넣는다
 * ex3-2) 중복 신고는 Value 에서 contan으로 식별하여 아닐 경우에만 추가한다
 * ex4) 그래서 k값보다 많이 신고된 횟수를 가진 K값을 추려내고
 * ex5) 그 K값을 V값으로 갖는 수만큼 result에 출력한다.
 * 2. k번 이상 신고된 유저는 게시판 이용이 정지된다
 * 3. 유저가 신고한 모든 내용을 취합하여 신고한 사람에게 정지된 사람의 수를 return 한다.
 * 3.
 */
public class KaKaoReport {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        ArrayList<String[]> strings = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String a;
        int[] reportNum = new int[id_list.length];
        for (int i = 0; i < report.length; i++) {
            sb = new StringBuilder();
            if (!hashMap.containsKey(report[i].split(" ")[0])) {
                hashMap.put(report[i].split(" ")[0], report[i].split(" ")[1]);
            } else {
                if (!hashMap.get(report[i].split(" ")[0]).contains(report[i].split(" ")[1])) {
                    sb.append(hashMap.get(report[i].split(" ")[0])).append(" ");
                    sb.append(report[i].split(" ")[1]);
                    hashMap.put(report[i].split(" ")[0],sb.toString());
                }
            }
            }
        String[] strings1;
        for (String s : hashMap.keySet()) {
            strings1 = hashMap.get(s).split(" ");
            System.out.println(Arrays.toString(strings1));
            for (int i = 0; i < strings1.length; i++) {
                if (strings1[i].equals(id_list[i])) {

                }
            }
        }
        for (String s : hashMap.keySet()) {
            for (int i = 0; i < id_list.length; i++) {
                if (hashMap.get(s).contains(id_list[i])) {
                    reportNum[i]++;
                }
            }
        }
        int check=0;
        for (String s : hashMap.keySet()) {
            for (int i = 0; i < id_list.length; i++) {
                if (hashMap.get(s).contains(id_list[i])&&reportNum[i]>=k) {
                    answer[check]++;
                }
            }
            check++;
        }

        return answer;
    }

    public static void main(String[] args) {
        KaKaoReport kaKaoReport = new KaKaoReport();
        String[] idlist = {"a", "ab", "abc", "b"};
        String[] report = {"ab a", "ab abc", "ab b", "abc a", "abc ab", "abc b"};
        int k=2;
        System.out.println(Arrays.toString(kaKaoReport.solution(idlist, report, k)));
    }
}
//"ryan con", "ryan con", "ryan con", "ryan con"