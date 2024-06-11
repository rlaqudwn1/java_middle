package codingtest_learn.KaKao.Blind2018;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  파일 정렬문제
 *  1. 파일명을 Head의 사전순으로 정렬한다.
 *  2. 사전순으로 정렬한 이후로 넘버의 숫자 내림차순으로 정렬한다.
 *  3. 파일명의 HEAD와 NUMBER를 숫자를 기준으로 나눈다.
 *  3-1 Head의 대소문자 구분을 없애기 위해 LowerCase 한다.
 */
public class FileCompress {
    // 파일명 헤드 넘버 꼬리 변수를 가진 file 객체
    class file implements Comparable<file> {
        String file_name = "";
        String head = "";

        public file(String file_name, String head, int number) {
            this.file_name = file_name;
            this.head = head;
            this.number = number;
        }

        int number = 0;

        public String getHead() {
            return head;
        }

        public int getNumber() {
            return number;
        }

        String tale = "";
        @Override
        public int compareTo(file o) {
            int res = this.getHead().compareTo(o.getHead());
            if (this.getHead().compareTo(o.getHead())==0) {
               return res = this.getNumber() - o.getNumber();
            }
            return res;
        }
    }

    public String[] solution(String[] files) {
        ArrayList<file> fileArrayList = new ArrayList<>();
        String[] answer = new String[files.length];
        file[] filearray = new file[files.length];
        for (int i = 0; i < files.length; i++) {
            int end_head = head_Index(files[i]);
            int end_num = index_Num(files[i], end_head);
            filearray[i] = new file(files[i], files[i].substring(0, end_head).toLowerCase()
                    , Integer.parseInt(files[i].substring(end_head, end_num)));
        }
        Arrays.sort(filearray);
        for (int i = 0; i < filearray.length; i++) {
            System.out.println(filearray[i].number);
            answer[i] = filearray[i].file_name;
        }
        return answer;
    }

    // head의 마지막 인덱를 받아 숫자가 아닌 경우나 다섯글자가 넘어가는 경우의 인덱스를 반환해 substring 지점을 계산
    private int index_Num(String file, int start_index) {
        int len = file.length();
        int end = len;
        int count= 0;
        for (int i = start_index; i < len; i++) {
            if (!Character.isDigit(file.charAt(i))) {
                end = i;
                break;
            }
            count+=1;
            if (count == 5) {
                end = i + 1;
                break;
            }
        }
        return end;
    }
    // 처음 숫자를 만나는 지점이 Head 인덱스의 끝이고 Num의 인덱스의 시작으로 substring 지점을 나눈다.
    private int head_Index(String file) {
        int len = file.length();
        int end = len;

        for(int i=0; i<len; i++) {
            if(Character.isDigit(file.charAt(i))) {
                end = i;
                break;
            }
        }

        return end;
    }
        public static void main (String[]args){
            FileCompress fileCompress = new FileCompress();
            String[] files = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
            System.out.println(Arrays.toString(fileCompress.solution(files)));
        }
}