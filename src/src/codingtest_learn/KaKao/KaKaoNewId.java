package codingtest_learn.KaKao;

import java.util.ArrayList;

public class KaKaoNewId {
    public String solution(String new_id) {
        char[] new_idch = new_id.toLowerCase().toCharArray();
        ArrayList<Character> idchar = new ArrayList<>();
        for (char ch : new_idch) {
            if (((ch >=48)&&(ch<=57))|| ch == '_' || ch == '-' || ch == '.' || ((ch <= 122) && (97 <= ch))) {
                idchar.add(ch);
            }
        }
        for (int i = 0; i < idchar.size()-1; i++) {
            if (idchar.get(i) == '.') {
                if (idchar.get(i + 1)=='.') {
                    idchar.remove(i);
                    i=-1;
                }
            }
        }
        System.out.println(idchar);
        while (idchar.get(0) == '.' || idchar.get(idchar.size() - 1) == '.') {
            if (idchar.get(0) == '.') idchar.remove(0);
            if (idchar.isEmpty()) break;
            if (idchar.get(idchar.size()-1) == '.') idchar.remove(idchar.size()-1);
        }
        if (idchar.isEmpty()) {
            idchar.add('a');
        }
        while (!(idchar.size() <= 15)) {
            idchar.remove(idchar.size() - 1);
        }
        if (idchar.get(idchar.size() - 1) == '.') {
            idchar.remove(idchar.size() - 1);
        }
        while (!(idchar.size() >= 3)) {
            idchar.add(idchar.get(idchar.size()-1));
        }
        String answer = "";
        for (Character c : idchar) {
            answer += c.toString();
        }
        return answer;
    }
    public static void main(String[] args) {
        KaKaoNewId kaKaoNewId = new KaKaoNewId();
        System.out.println(kaKaoNewId.solution("=.="));
    }
}
