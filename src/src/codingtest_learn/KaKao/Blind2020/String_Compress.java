package codingtest_learn.KaKao.Blind2020;

public class String_Compress {
    public int solution(String s) {
        int ans = s.length();
        for (int i = 1; i <= s.length() / 2; i++) {
            int len = 0;

            for(int j = 0; j + i <= s.length();){
                int h = j + i;
                int cnt = 1;
                String seg = s.substring(j, j + i);

                while(h + i <= s.length() && seg.equals(s.substring(h, h + i))){
                    h += i;
                    cnt ++;
                }

                if(cnt == 1) len += i;
                else len += i + String.valueOf(cnt).length();

                j = h;
            }

            if(s.length() % i != 0) len += s.length() % i;
            ans = Math.min(ans, len);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "aabbaccc";
        String_Compress stringCompress = new String_Compress();
        System.out.println(stringCompress.solution(s));
    }
}
