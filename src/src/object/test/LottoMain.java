package object.test;

public class LottoMain {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int[] lottoNum =lotto.generate();
        System.out.print("로또 번호: ");
        for (int i : lottoNum) {
            System.out.print(i+" ");
        }

    }
}
