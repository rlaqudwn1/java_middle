package generic.collection.ex;

import java.util.Random;

public class Word {
    private String question;
    private String hWquestion;

    public Word(String question, String hWquestion) {
        this.question = question;
        this.hWquestion = hWquestion;
    }

    public String getQuestion() {
        return question;
    }

    public String gethWquestion() {
        return hWquestion;
    }

    @Override
    public String toString() {
        return "Word{" +
                "question='" + question + '\'' +
                ", hWquestion='" + hWquestion + '\'' +
                '}';
    }
    public void getRandom() {

    }
}
