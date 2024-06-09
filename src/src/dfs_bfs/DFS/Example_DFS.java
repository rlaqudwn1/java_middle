package dfs_bfs.DFS;

import nested.nested.inner.InnerOuter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



// +,- 에 대한 연결리스트 생성
public class Example_DFS {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        DFS(numbers,target);
        return answer;
    }

    private void DFS(int[] numbers, int target) {
        LinkedList<Integer> linkedList[];
        linkedList = new LinkedList[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            linkedList[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

    }
}
