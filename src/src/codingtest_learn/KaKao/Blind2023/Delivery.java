package codingtest_learn.KaKao.Blind2023;

/**
 * 1.배달 개수 기준으로 cap의 개수를 초과하지 않는 선에서 맨 뒤에서 출발
 * 2. 배달 하면서 수거한다. 단 수거물과 cap을 구별해야한다.
 * 3. 배달한 곳과 수거한 곳의 배열을 0으로 제거하며 뒤에서 앞으로 1,2의 과정을 반복한다.
 * 4. 배달 거리는 맨 마지막 배달집 기준 2배로 잡는다.**
 */
public class Delivery {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
    long answer = 0;
    int len = 0;
    int last_index = deliveries.length;
        for (int i = deliveries.length - 1; i >= 0; ) {
            if (deliveries[i] == 0 && pickups[i] == 0) {
                i--;
                continue;
            }
            int caps =cap;
            for (int j = i; j >= 0; ) {
                if (caps >= deliveries[j]) {
                    caps -= deliveries[j];
                    deliveries[j--] = 0;
                } else {
                    deliveries[j] -= caps;
                    break;
                }
                caps=cap;
                for (int k = i; k >= 0; ) {
                    if (caps >= pickups[k]) {
                        caps -= pickups[k];
                        deliveries[k--] = 0;
                    } else {
                        deliveries[k] -= caps;
                        break;
                    }
                }
                answer += (long)((i + 1) * 2L);
            }
        }

    return answer;
    }

    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        int[] del = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        delivery.solution(4, 5, del, pickups);

    }
}
