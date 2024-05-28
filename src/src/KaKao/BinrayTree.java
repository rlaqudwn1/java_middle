package KaKao;

/**
 * 이진트리  1+2^n= 이진트리
 * 1. 수를 이진법으로 변환한다.
 * 2. 이진법의 길이가 2^n-1이 되어야 한다.
 * 2-1 이진법의 길이를 2^n-1이 되도록 더미 0을 앞에 추가한다.
 * 3. 부모노드가 없는 경우에서 자식노드가 있으면 fail 있으면 true
 * 4. 부모를 기준으로 왼쪽 오른쪽 트리로 나뉘며 그 트리에서도 부모의 값이 1인지 확인한다.
 * 5. 재귀함수로 모든 트리의 부모의 존재여부를 탐색
 * 6. 탐색 후 이진트트리로 표현할 수 있는가.
 * 7. 마지막 원본 트리가 만들어 질 수 있는지 확인.
 */
public class BinrayTree {
    public int[] solution(long[] numbers) {
        int[] answer = {};
        StringBuilder sb = new StringBuilder(Long.toBinaryString(i));
        for (int j = 0; j < i; j++) {
            if (Math.pow(2, j) - 1 == sb.length()) {
                System.out.println(sb+"true");
            }else if (Math.pow(2, j)-1 > sb.length()) {
                while (Math.pow(2, j) - 1 != sb.length()) {
                    sb = new StringBuilder("0" + sb);
                }
                System.out.println(sb);
                break;
            }
        }
        findTree(sb);
        return answer;
    }

    private void findTree(StringBuilder i) {
        // 트리 기준 양 옆으로 반으로 나눈 뒤
        // 부모 노드가 0일 경우에 양 옆에 있는 노드에 1이 있으면 fail



    }

    public static void main(String[] args) {
        BinrayTree binrayTree = new BinrayTree();
        binrayTree.solution(new long[]{7, 42, 5});
    }
}
