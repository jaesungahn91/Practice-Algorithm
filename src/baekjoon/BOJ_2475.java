package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 검증수
// https://www.acmicpc.net/problem/2475
public class BOJ_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*StringTokenizer st = new StringTokenizer(br.readLine(), " ");*/

        String[] st = br.readLine().split(" ");

        int sum = 0;

        /*while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sum += (num*num);
        }*/

        for (String s : st) {
            int num = Integer.parseInt(s);
            sum += (num*num);
        }

        System.out.println(sum % 10);
    }
}
