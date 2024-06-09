package codingtest_learn.KaKao;
// 카카오 진법변환
// t의 개수가 목표 개수가 될 때 까지 반복
//0에서부터 시작 해 0,1,2,3,4,5~~
// while(t!=aim)
// num=0 ++;
// if n<9: 진법 변환, 11<n<16 진법 변환
//# 진법 변환한 string에 길이만큼 m을 진행시키고 그중 p가 있으면
//# 그 자리의 String값을 +하고 aim+1
public class Bin {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int aim = 0;
        int ins = 1;
        while (t==0) {
            String[] aimStr = Integer.toString(aim,n).split("");
            for (int i = 0; i < aimStr.length; i++) {
                if (ins == p) {
                    t--;
                    System.out.println(t);
                    answer += aimStr[i].toUpperCase();
                    if (t == 0) {
                        return answer;
                    }
                }
                ins++;
                if (ins > m) {
                    ins = 1;
                }
            }
            aim++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Bin bin = new Bin();
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;

        System.out.println(bin.solution(n, t, m, p));


    }
}
