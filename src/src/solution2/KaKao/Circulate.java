package solution2.KaKao;

import java.util.ArrayList;

// 숫자들을 파싱해서 배열에 넣는다
// 연산자도 파싱해서 배열에 넣는다
// 연산방법은 숫자 연산자 숫자이며 숫자[i] 연산자[i] 숫자[i+1]=값
// remove (숫자[i] 연산자[i] 숫자[i+1])
// or (숫자[i-1] 연산자 [i] 숫자[i+1])
// 연산자 개수만큼 반복하며. 절대값이 가장 큰 점수가 우승한다.

public class Circulate {
    public long solution(String expression) {
        long answer = 0;
        int start_index=0;
        String addStr = "";
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList2 = new ArrayList<>();

        String[] str = expression.split("");
        for (int i = 0; i < str.length; i++) {
            addStr = "";
            if (str[i].equals("*") || str[i].equals("+") || str[i].equals("-")) {
                for (int j = start_index; j < i; j++) {
                    addStr += str[j];
                }
                stringArrayList.add(addStr);
                stringArrayList.add(str[i]);
                start_index=i+1;
            }
            if (i == str.length - 1) {
                for (int j =start_index; j < i+1; j++) {
                    addStr+=str[j];
                }
                stringArrayList.add(addStr);
            }
        }
        stringArrayList2= (ArrayList<String>) stringArrayList.clone();
        System.out.println(stringArrayList2);
        // 케이스 *-+ *+- +*- +-* -*+ -+*;


        // 케이스 1. *-+
        stringArrayList=ab(stringArrayList);
        stringArrayList = Minus(stringArrayList);
        stringArrayList = Plus(stringArrayList);
        answer=Math.max(Math.abs(Integer.parseInt(stringArrayList.get(0))), answer);
        stringArrayList = (ArrayList<String>) stringArrayList2.clone();
//        // *+-
        stringArrayList=ab(stringArrayList);
        stringArrayList = Plus(stringArrayList);
        System.out.println(stringArrayList);
        stringArrayList = Minus(stringArrayList);
        answer=Math.max(Math.abs(Integer.parseInt(stringArrayList.get(0))), answer);
        System.out.println(answer);
        stringArrayList = (ArrayList<String>) stringArrayList2.clone();
//        // *+-
        stringArrayList=Plus(stringArrayList);
        stringArrayList = ab(stringArrayList);
        stringArrayList = Minus(stringArrayList);
        answer=Math.max(Math.abs(Integer.parseInt(stringArrayList.get(0))), answer);
        stringArrayList = (ArrayList<String>) stringArrayList2.clone();
//        // *+-
        stringArrayList=Plus(stringArrayList);
        stringArrayList = Minus(stringArrayList);
        stringArrayList = ab(stringArrayList);
        answer=Math.max(Math.abs(Integer.parseInt(stringArrayList.get(0))), answer);
        stringArrayList = (ArrayList<String>) stringArrayList2.clone();
//
//        // -+*
        stringArrayList=Minus(stringArrayList);
        stringArrayList = Plus(stringArrayList);
        stringArrayList = ab(stringArrayList);
        answer=Math.max(Math.abs(Integer.parseInt(stringArrayList.get(0))), answer);
        stringArrayList = (ArrayList<String>) stringArrayList2.clone();
//        // -*+
        stringArrayList=Minus(stringArrayList);
        stringArrayList = ab(stringArrayList);
        stringArrayList = Plus(stringArrayList);
        answer=Math.max(Math.abs(Integer.parseInt(stringArrayList.get(0))), answer);
        stringArrayList = (ArrayList<String>) stringArrayList2.clone();
        return answer;
    }

    private ArrayList<String> Plus(ArrayList<String> stringArrayList) {
        int result=0;
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (stringArrayList.get(i).equals("+")) {
                stringArrayList.set(i, String.valueOf(Integer.parseInt(stringArrayList.get(i - 1)) + Integer.parseInt(stringArrayList.get(i + 1))));
                stringArrayList.remove(i - 1);
                stringArrayList.remove(i);i=0;
            }
        }
        return stringArrayList;
    }private ArrayList<String> Minus(ArrayList<String> stringArrayList) {
        int result=0;
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (stringArrayList.get(i).equals("-")) {
                stringArrayList.set(i, String.valueOf(Integer.parseInt(stringArrayList.get(i - 1)) - Integer.parseInt(stringArrayList.get(i + 1))));
                stringArrayList.remove(i - 1);
                stringArrayList.remove(i);
                System.out.println(stringArrayList);
                i=0;
            }
        }
        return stringArrayList;
    }private ArrayList<String> ab(ArrayList<String> stringArrayList) {
        int result=0;
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (stringArrayList.get(i).equals("*")) {
                stringArrayList.set(i, String.valueOf(Integer.parseInt(stringArrayList.get(i - 1)) * Integer.parseInt(stringArrayList.get(i + 1))));
                stringArrayList.remove(i - 1);
                stringArrayList.remove(i);i=0;
            }
        }
        return stringArrayList;
    }


    public static void main(String[] args) {
        Circulate circulate = new Circulate();
        System.out.println(circulate.solution("100-200*300-500+20"));
    }

}
