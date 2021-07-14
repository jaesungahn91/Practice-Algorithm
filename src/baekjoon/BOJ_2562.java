package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최댓값
public class BOJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int maxIdx = 0;
        for (int i=0; i<9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                maxIdx = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIdx);
    }
}
