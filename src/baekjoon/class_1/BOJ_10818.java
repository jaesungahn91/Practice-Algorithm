package baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소, 최대
// https://www.acmicpc.net/problem/10818
public class BOJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int max = -1000001;
        int min = 1000001;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        if (st.countTokens() == N) {
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if (num > max) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
            }
            System.out.println(min + " " + max);
        }
    }
}
