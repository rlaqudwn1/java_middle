package codingtest_learn.KaKao.Blind2019;

/**
 *  HashMap에 한 행매다 유일성을 띄는
 */
public class Candidate_Key {
    public int solution(String[][] relation) {
        int row = relation[0].length;   //행렬
        int column = relation.length;

        int answer = 0;
        return answer;
    }
    public static void main(String[] args) {
        Candidate_Key candidateKey = new Candidate_Key();
        String[][] relation = {{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "2"}, {"300", "tube", "computer", "3"}, {"400", "con", "computer", "4"}, {"500", "muzi", "music", "3"}, {"600", "apeach", "music", "2"}};
        candidateKey.solution(relation);

    }
}
