package solution2.KaKao;

// t의 개수가 목표 개수가 될 때 까지 반복
//0에서부터 시작 해 0,1,2,3,4,5~~
//        그 숫자들을 진법변환 해서 p의 차례까지 t번 올 때 문자를 하나씩 더한다.
//         진법 변환은 2~9까지 10진수는 그대로 11~16은 따로 진법 변환을 만든다.
// while(t!=aim)
//        # num=0 ++;
//        # if n<9: 진법 변환, 11<n<16 진법 변환
//# 진법 변환한 string에 길이만큼 m을 진행시키고 그중 p가 있으면
//# 그 자리의 String값을 +하고 aim+1
public class Bin {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int aim = 0;
        System.out.println(Integer.toString(13, 14));
        while (t != aim) {
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

        bin.solution(n, t, m, p);


    }
}
