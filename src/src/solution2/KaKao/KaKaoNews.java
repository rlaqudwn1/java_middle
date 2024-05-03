package solution2.KaKao;

import java.util.ArrayList;

public class KaKaoNews {
    //문자열의 지카드 유사도 구하는 문제
    //문자열을 2개씩 끊어서 다중집합의 원소가 되며*공백이나 특수문자가 들어있는 경우 글자 쌍을 버린다.*
    //원소의 대소문자 차이는 무시한다(upper)
    //글자 쌍의 원소를 가진 집합에 대해 교집합/합집합=자카드 유사도를 구해야 한다.

    public int solution(String str1, String str2) {


        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        //문자열을 2개씩 끊어 다중집합의 원소를 배열에 넣는다
        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90 && str1.charAt(i + 1) >= 65 && str1.charAt(i + 1) <= 90) {
                arrayList.add(str1.substring(i, i + 2));
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            if (str2.charAt(i) >= 65 && str2.charAt(i) <= 90 && str2.charAt(i + 1) >= 65 && str2.charAt(i + 1) <= 90) {
                arrayList2.add(str2.substring(i, i + 2));
            }
        }
        //배열의 차집합 B-A구하기
        int contains = 0;
        ArrayList<String> subArray = new ArrayList<>(arrayList2);
        for (String string : arrayList) {
            subArray.remove(string);
        }
        // answer=교집합/(전체집합-교집합)*65536
        int and = arrayList2.size() - subArray.size(); //교집합
        int sum = arrayList.size() + subArray.size(); //합집합
        answer = and / sum * 65536;
        if (sum == 0) {
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        KaKaoNews kaKaoNews = new KaKaoNews();
        System.out.println(kaKaoNews.solution("FRANCE", "french"));


    }
}
