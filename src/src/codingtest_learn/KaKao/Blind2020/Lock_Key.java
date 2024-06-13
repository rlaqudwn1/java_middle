package codingtest_learn.KaKao.Blind2020;

/**
 * 0. key의 1의 범위를 정한다. ex) key의 1이 모든 x축 y축에 존재하면 스핀말고는 할 수 있는게 없다.
 * 0.1 key의 1의 x, y의 존재범위를 찾아 N,M에 대입
 *  1.M과 N이 같고 lock의 길이와 같다면 spin 4번만 실행하고 return
 *  2.M과 N이 lock의 길이보다 작으면 필요한 만큼 움직이고 0을 실행해 90도 회전 후 다시 움직이고 4번반복
 *  2-1 lock-M만큼 1씩 오른쪽으로 움직이고 lock-N 1만큼 내려가고 왼쪽에서 오른쪽으로 이동한다.
 *  2-2 y축이 N-M만큼 이동하면 처음 좌표로 90도 이동해서 2-1반복한다.
 *  3. Lock의 모든 배열을 만났다면 true 아니면 false를 출력한다.
 */

import java.util.Arrays;

/**
 * 1. 오른쪽
 */
public class Lock_Key {

    public boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;
        int M = key.length;
        int N = lock.length;
        int[] xy = {0, 0};
        int[][] spins = new int[N][N];
        find_key_lenth(key);
        arrayup(key);
        System.out.println(Arrays.deepToString(key));
        if (key.length == lock.length) {
            for (int i = 0; i < 4; i++) {
                spin(key, spins);
                correct(key, lock);
            }
        }
        System.out.println(Arrays.deepToString(spins));
        return Arrays.deepEquals(lock, spins);
    }

    private void arraydown(int[][] key) {
        int temp=0;
        for (int i = 0; i < key.length; i--) {
            for (int j = key.length - 2; j>=0; j--) {
                if (key[i][j] == 1) {
                    temp = key[i+1][j];
                    key[i + 1][j] = key[i][j];
                    key[i][j] = temp;
                }
            }
        }
    }

    private void arrayup(int[][] key) {
    int temp;
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key.length; j++) {
                if (key[i][j] == 1) {
                    temp = key[i-1][j];
                    key[i - 1][j]= key[i][j] ;
                    key[i][j] = temp;
                }
            }
        }
    }

    private void arrayleft(int[][] key) {
        int temp;
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key.length; j++) {
                if (key[i][j] == 1) {
                    temp = key[i][j-1];
                    key[i][j-1]= key[i][j] ;
                    key[i][j] = temp;
                }
            }
        }
    }

    private void arrayright(int[][] key) {
        int temp=0;
        for (int i = key.length-2; i >=0; i--) {
            for (int j = 0; j < key.length; j++) {
                if (key[i][j] == 1) {
                    temp = key[i][j + 1];
                    key[i][j + 1] = key[i][j];
                    key[i][j] = temp;
                }
            }
        }
    }

    private void find_key_lenth(int[][] key) {
        int xmin = 100;
        int xmax = 0;
        int ymin = 100;
        int ymax = 0;

        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key.length; j++) {
                if (key[i][j] == 1) {
                    xmax = Integer.max(xmax, j);
                    ymax = Integer.max(ymax, i);
                    xmin = Integer.min(xmin, j);
                    ymin = Integer.min(ymin, i);
                }
            }
        }
    }

    private void correct(int[][] key, int[][] lock) {
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key.length; j++) {
                if (key[i][j] == 1 && lock[i][j] == 1) {
                    lock[i][j]=0;
                }
            }
        }
    }

    private void spin(int[][] key, int[][] spins) {
        int temp=0;
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key.length; j++) {
                spins[i][j] = key[key.length-1-j][i];
            }
        }
    }

    public static void main(String[] args) {
        Lock_Key lockKey = new Lock_Key();
        int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println(lockKey.solution(key, lock));
    }
}