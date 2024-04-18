package generic.collection.ex;

import java.util.Scanner;
import java.util.Vector;

public class WordTest {
    public static void main(String[] args) {
        int a=0;
        Scanner scanner = new Scanner(System.in);
        Vector<Word> words = new Vector<Word>();
        words.add(new Word("apple", "사과"));
        words.add(new Word("banana", "바나나"));
        words.add(new Word("pear", "배"));
        for (int i = 0; i < words.size(); i++) {
            System.out.println("-1을 입력하면 종료합니다");
            if (scanner.nextInt() == -1) {
                break;
            }
            System.out.println(words.get(i).getQuestion()+"?");
            System.out.println(String.format("(%d),%s :",a, words.get(i).gethWquestion()));
        }

    }
}
