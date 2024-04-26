package solution;

public class Conversion {
    public int solution(int x, int y, int n) {

        int answer = 0;
        if (y % 2!=0 && y%3!=0 && x+n!=y) {           //2와 3을 곱하거나 n을 더해도 y가 나오지 않는 경우는 -1을 반환한다.
            return answer=-1;
        }

        int testa=0;
        int testb=0;
        testa=y/2;
        testb=y/3;
        if (x + n == y) {
            return ++answer;
        }
        if (x + n == testa) {
            return answer+=2;
        }
        if (x * 2 == testa|| x*3 == testa) {

        }


        return answer;
    }

    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println(conversion.solution(10, 40, 5));
    }

}
