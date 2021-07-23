package baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 찾기
public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        char[] alphabetArr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] chrArr = S.toCharArray();

        for (int i=0; i<alphabetArr.length; i++) {
            boolean chk = false;
            int idx = 0;
            for (int j=0; j<chrArr.length; j++) {
                if (alphabetArr[i] == chrArr[j]) {
                    chk = true;
                    idx = j;
                    break;
                }
            }
            if (chk) {
                System.out.print(idx + " ");
            } else {
                System.out.print("-1 ");
            }
        }
    }
}
