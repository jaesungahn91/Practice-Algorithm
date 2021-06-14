package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 공부
// https://www.acmicpc.net/problem/1157
public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split("");

        for (String s : st) {
            System.out.println(s);
        }
    }
}
