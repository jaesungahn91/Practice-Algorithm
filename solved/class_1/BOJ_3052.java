package baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 나머지
public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] div = new int[10];
        for (int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            div[i] = num % 42;
        }
        int result = 0;
        for (int i=0; i<div.length; i++) {
            int cnt = 0;
            for (int j=i+1; j<div.length; j++) {
                if (div[i] == div[j]) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
