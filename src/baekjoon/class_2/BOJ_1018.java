package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 체스판 다시 칠하기
public class BOJ_1018 {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NM = br.readLine();
        int N = Integer.parseInt(NM.split(" ")[0]);
        int M = Integer.parseInt(NM.split(" ")[1]);

        arr = new boolean[N][M];

        // 보드 입력
        for (int i = 0; i< N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int X = N - 7;
        int Y = M - 7;

        for (int i=0; i<X; i++) {
            for (int j=0; j<Y; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find (int x, int y) {
        int endX = x + 8;
        int endY = y + 8;
        int cnt = 0;

        boolean target = arr[x][y];

        for (int i=0; i<endX; i++) {
            for (int j=0; j<endY; j++) {
                if (arr[i][j] != target) {
                    cnt++;
                }
                target = !target;
            }
            target = !target;
        }

        cnt = Math.min(cnt, 64 - cnt);

        min = Math.min(min, cnt);
    }
}
