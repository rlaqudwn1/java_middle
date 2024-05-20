package KaKao;

/**
 * 1.배달 개수 기준으로 cap의 개수를 초과하지 않는 선에서 맨 뒤에서 출발
 * 2. 배달 하면서 수거한다. 단 수거물과 cap을 구별해야한다.
 * 3. 배달한 곳과 수거한 곳의 배열을 0으로 제거하며 뒤에서 앞으로 1,2의 과정을 반복한다.
 * 4. 배달 거리는 맨 마지막 배달집 기준 2배로 잡는다.**
 */
public class Delivery { public long solution(int cap, int n, int[] deliveries, int[] pickups) {
    long answer = -1;
    boolean index= true;
    int len=0;
    int last_index = deliveries.length;
    while (true) {
        index=true;
        int caps= cap;
        for (int i = deliveries.length-1; i >= 0; i++) {
            if (deliveries[i] !=0) {
                if (cap < deliveries[i]) {
                    break;
                } else {
                    caps -= deliveries[i];
                    deliveries[i]=0;
                }
            }


                if (index) {
                    len=i;
                    index=false;
                }
            }
        }
//    return answer;
}

    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        int[] del = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        delivery.solution(4, 5, del, pickups);

    }
}
