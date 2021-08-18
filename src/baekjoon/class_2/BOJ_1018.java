package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 체스판 다시 칠하기
public class BOJ_1018 {

    public static boolean[][] board;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NM = br.readLine();
        int N = Integer.parseInt(NM.split(" ")[0]);
        int M = Integer.parseInt(NM.split(" ")[1]);

        // true = W / false = B
        board = new boolean[N][M];

        for (int i=0; i<N; i++) {
            String row = br.readLine();
            for (int j=0; j<M; j++) {
                board[i][j] = !(row.charAt(j) == 'B');
            }
        }

        int nRow = N - 7;
        int mCol = M - 7;

        for (int i=0; i<nRow; i++) {
            for (int j=0; j<mCol; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y) {
        int x_end = x + 8;
        int y_end = y + 8;

        boolean block = board[x][y];
        int count = 0;

        for (int i=x; i<x_end; i++) {
            for (int j=y; j<y_end; j++) {
                if (board[i][j] != block) {
                    count++;
                }
                block = !block;
            }
            block = !block;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }

}
