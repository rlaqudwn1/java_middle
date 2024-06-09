package codingtest_learn.KaKao.Blind2023;

import java.util.*;

/**
 * 1. privacies의 문자 배열들을 파싱하여 날짜를 숫자로 변환
 * 2. 유효기간에 맞춰 개인정보 보관기관을 설정한다.
 * 3. 조정된 보관기관과 오늘날짜와 맞춰 개인정보를 파기할지 결정하고 출력한다.
 */

/**
 * 리팩토링) 년 ,월을 일로 변환하여 계산한다.
 * 이유 년, 월을 따로 계산할 경우 년단위 월단위 일단위로 계산하는 if문의 예외처리가 까다로웠고 가독성이 떨어진다.
 * 미리 년, 월을 일로 통합하면 예외처리에 대한 걱정이 줄며 코드수도 확연히 줄어들었다.
 *
 * 리팩토링 결과
 */
public class Personal_Info {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String ad;
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] sub = terms;
        for (int i = 0; i < terms.length; i++) {
            sub = terms[i].split(" ");
            hashMap.put(sub[0], Integer.parseInt(sub[1]));
        }
        for (int i = 0; i < privacies.length; i++) {
            ad = privacies[i].substring(0, privacies[i].length() - 2);
            String[] index = ad.split("\\.");
            int[] v = new int[3];
            for (int j = 0; j < index.length; j++) {
                v[j]=Integer.parseInt(index[j]);
            }
            int totaldays= (v[0]*12*28)+(v[1]*28)+v[2]-1;     //년 월 일을 일수로 바꿔 계산한다.
            totaldays+=hashMap.get(privacies[i].substring(privacies[i].length() - 1)) * 28;
            arrayList.add(totaldays);
        }
        ArrayList<Integer> answer2 = new ArrayList<>();
        String[] toArray = today.split("\\.");
        int todays = (Integer.parseInt(toArray[0]) * 28 * 12) + (Integer.parseInt(toArray[1]) * 28) + Integer.parseInt(toArray[2]);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) <todays) {
                answer2.add(i+1);
            }
        }
        int[] answer = new int[answer2.size()];
        for (int i = 0; i < answer2.size(); i++) {
            answer[i] = answer2.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Personal_Info personalInfo = new Personal_Info();
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] pricacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(personalInfo.solution("2022.05.19", terms, pricacies)));
    }
}
/**
 * 리팩토링 전 코드 년 월 일을 따로 분리했기 때문에 변수관리와 예외처리 디버깅이 더 난해하다.
 */
//public int[] codingtest_learn.solution(String today, String[] terms, String[] privacies) {
//    StringBuilder sb = new StringBuilder();
//    String ad;
//    ArrayList<int[]> arrayList = new ArrayList<>();
//    HashMap<String, Integer> hashMap = new HashMap<>();
//    String[] sub = terms;
//    for (int i = 0; i < terms.length; i++) {
//        sub = terms[i].split(" ");
//        hashMap.put(sub[0], Integer.parseInt(sub[1]));
//    }
//    System.out.println(hashMap);
//    for (int i = 0; i < privacies.length; i++) {
//        ad = privacies[i].substring(0, privacies[i].length() - 2);
//        String[] index = ad.split("\\.");
//        int[] v = new int[3];
//        for (int j = 0; j < index.length; j++) {
//            v[j]=Integer.parseInt(index[j]);
//        }
//        arrayList.add(v);
//        arrayList.get(i)[1]+=hashMap.get(privacies[i].substring(privacies[i].length()-1));
//        if (arrayList.get(i)[1] > 12){
//            arrayList.get(i)[0] += arrayList.get(i)[1]/12;
//            arrayList.get(i)[1]%=12;
//        }
//        if (arrayList.get(i)[2] == 1) {
//            arrayList.get(i)[2]= 28;
//            arrayList.get(i)[1] -= 1;
//        } else v[2] -= 1;
//        if (arrayList.get(i)[1] == 0) {
//            arrayList.get(i)[1]= 12;
//            arrayList.get(i)[0] -= 1;
//        }
//    }
//    Set<Integer> answer2 = new HashSet<>();
//    String[] toArray = today.split("\\.");
//    for (int i = 0; i < arrayList.size(); i++) {
//        for (int j = 0; j < toArray.length; j++) {
//            if (!(arrayList.get(i)[j] >= Integer.parseInt(toArray[j]))) {
//                answer2.add(i+1);
//            }
//        }
//    }
//    int[] answer = new int[answer2.size()];
//    int count=0;
//    for (Integer i : answer2) {
//        answer[count++]=i;
//    }
//    return answer;
//}