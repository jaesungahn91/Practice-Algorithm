package baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX퀴즈
// https://www.acmicpc.net/problem/8958
public class BOJ_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            String str = br.readLine();

            String[] strArr = str.split("");

            int score = 0;
            int ctScore = 0;
            for (int j=0; j< strArr.length; j++) {
                if (strArr[j].equals("O")){
                    if (j != 0 && strArr[j-1].equals("O")) {
                        ctScore += 1;
                    } else {
                        ctScore = 1;
                    }
                } else {
                    ctScore = 0;
                }
                score += ctScore;
            }
            System.out.println(score);
        }

    }
}
