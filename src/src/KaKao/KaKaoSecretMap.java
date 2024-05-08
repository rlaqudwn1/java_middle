package KaKao;

// toBinaryString을 이용해 2진법 문자열을 바꾼다
// 바꾼 두 문자열 중 1이 하나라도 있는지 확인하고 있으면 #을 추가하고 아니면 공백을 추가한다
// 결과물을 배열에 저장하고 arr배열이 끝날 때 까지 반복.


import java.util.Arrays;

public class KaKaoSecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String bin1 = "";
        String bin2 = "";
        for (int i = 0; i <arr1.length; i++) {
            String result = "";
            bin1="";
            bin2="";
            for (int j = Integer.toBinaryString(arr1[i]).length(); j <n ; j++) {
                bin1 += "0";
            }for (int j = Integer.toBinaryString(arr2[i]).length(); j <n ; j++) {
                bin2 += "0";
            }
            bin1 += Integer.toBinaryString(arr1[i]);
            bin2 += Integer.toBinaryString(arr2[i]);
            String[] base1 = bin1.split("");
            String[] base2 = bin2.split("");
            for (int j = 0; j < base1.length; j++) {
                if (base1[j].equals("1") || base2[j].equals("1")) {
                    result += "#";
                } else result += " ";
            }
            answer[i]=result;
        }
        return answer;
    }

    public static void main(String[] args) {
        KaKaoSecretMap kaKaoSecretMap = new KaKaoSecretMap();
        int n = 5;
        int[] arr = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        System.out.println(Arrays.toString(kaKaoSecretMap.solution(n, arr, arr2)));
    }

}
