package solution2;

// 프로그래머스 2단계 할인 행사
// 처음 10일간의 메뉴들을 배열에 저장시키고
// start_index와 end_index를 이용해 투 포인터로 조건을 충족시키는지 확인
// 할인 행사 품목을 투 포인터를 이용해 맞는지 아닌지 확인
// 단 품목당 14일이 걸리므로 4일이 지난 후  start_index와 end_index가 한칸씩 이동한다.



public class Sales {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int i=0;
        int result=0;
        int day=1;
        int[] why = new int[number.length];
        int[] checknum = new int[number.length];
        for (int l = 0; l < 10; l++) {
            add(discount[l], want, number, checknum,why);
        }
        for (int j = 0; j < number.length; j++) {
            result += why[j];
            if (result == number.length) {
                return day;
            }
        }

        for (int j = 10; j < discount.length; j++) {
            result=0;
            day++;
            if (day > 4) {
                add(discount[j],want,number,checknum,why);
                erase(discount[i],want,number,checknum,why);
                i++;
            }else add(discount[j],want,number,checknum,why);

            for (int k = 0; k < number.length; k++) {
                result += why[k];
            }
            if (result == number.length) {
                return  day;
            }

        }
        // 충족시킨 개수가 number의 길이만큼 충족시켰으면 모든 조건이 충족되었으므로 return answer;
        return 0;
    }

    private void erase(String s, String[] want, int[] number, int[] checknum,int[] why) {
        int j=0;
        for (int i = 0; i < want.length; i++) {
            if (s.equals(want[i])) {
                if (checknum[j] == number[j]) {
                    why[j]=0;
                }
                checknum[i]-=1;
                j=i;
            }
        }

    }

    private void add(String s, String[] want, int[] number, int[] checknum,int[] why) {
        int j=0;
        for (int i = 0; i < want.length; i++) {
            if (s.equals(want[i])) {
                checknum[i]+=1;
                j = i;
            }
        }
        if (checknum[j] >= number[j]) {
            why[j] = 1;
        }
    }

    public static void main(String[] args) {
        Sales sales = new Sales();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] num = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana","apple"};
        System.out.println(sales.solution(want, num, discount));
    }

}
