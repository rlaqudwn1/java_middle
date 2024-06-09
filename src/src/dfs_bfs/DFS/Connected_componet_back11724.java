package dfs_bfs.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Connected_componet_back11724 {
    static boolean visted[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visted = new boolean[n];
        A = new ArrayList[n];
        for (int i = 1; i < A.length; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int count =0;
        for (int i = 0; i < n; i++) {
            if (!visted[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int j) {
        if (visted[j]) {
            return;
        }
        visted[j]=true;
        for (int i : A[j]) {
            if (!visted[i]) {
                DFS(i);
            }
        }
    }
}
