package baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 알람 시계
// https://www.acmicpc.net/problem/2884
public class BOJ_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int hour = Integer.parseInt(str.split(" ")[0]);
        int min = Integer.parseInt(str.split(" ")[1]);

        if (min - 45 < 0) {
            if (hour - 1 < 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
            min = 60 + (min - 45);
        } else {
            min -= 45;
        }
        System.out.println(hour + " " + min);
        br.close();
    }
}
