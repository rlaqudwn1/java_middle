package codingtest_learn.KaKao.Blind2018;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 카카오 방금 그곡
 * 1. m에 저장된 문자열의 곡이 musicinfos곡에 있는지 확인.
 * 2. musicfos에서 곡이 재생된 시간, 곡의 이름, 곡의 코드등을 파싱한다.
 * 2-1 곡의 코드 수 보다 재생된 시간이 큰 경우 코드를 2까지 늘려 찾는다.
 * 2-2 #이 들어간 음을 다른 코드로 치환한다 ex) C#->Q D#->W
 * 3. 조건이 일치하는 경우가 여러개일 경우 재생시간이 제일 긴 제목을 반환한다.
 */
public class Song {
    static String[] chef = {"C#","D#","F#","G#","A#","B#","E#"};  //#이 들어간 치환할 코드 배열
    static String[] change = {"Q","W","E","R","T","Y","U"};     //#대신 들어갈 코드 배열
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        ArrayList<String[]> sp = new ArrayList<>();
        boolean[] correct = new boolean[musicinfos.length];
        int[] time = new int[musicinfos.length];
        int song_time=0;
        m= convert(m);
        for (int i = 0; i < musicinfos.length; i++) {
            sp.add(musicinfos[i].split(","));
        }
        for (int i = 0; i < musicinfos.length; i++) {
            time[i] = gettime(sp.get(i)[0].split(":"), sp.get(i)[1].split(":"));
            String[] music = (sp.get(i)[3]).split("");
            String code = "";
            if (time[i] <= 0) {
                for (int j = 0; j < music.length*2; j++) {
                    code += music[j % music.length];
                }
            }
            for (int j = 0; j < time[i]; j++) {
                code += music[j%music.length];
            }
            code = convert(code);
            if (code.contains(m)) {
                if (song_time < time[i]) {
                    song_time = time[i];
                    answer = sp.get(i)[2];
                }
            }
        }
        if (answer.isEmpty()) {
            return "(None)";
        }
        return answer;
    }

    private String convert(String m) {
        for (int i = 0; i < chef.length; i++) {
            m=m.replaceAll(chef[i], change[i]);
        }
        return m;
    }

    private int gettime(String[] split, String[] split1) {
        int start_time = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
        int end_time = Integer.parseInt(split1[0]) * 60 + Integer.parseInt(split1[1]);
        return end_time-start_time;
    }

    public static void main(String[] args) {
        Song song = new Song();
        String m = "A";
        String[] musicinfos = {"12:00,12:01,Sing,A", "12:00,13:00,Song,A"};
        System.out.println(song.solution(m, musicinfos));
    }
}
