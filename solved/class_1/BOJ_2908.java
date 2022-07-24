package baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 상수
// https://www.acmicpc.net/problem/2908
public class BOJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] arrA = str.split(" ")[0].toCharArray();
        char[] arrB = str.split(" ")[1].toCharArray();

        String A = "", B = "";
        for (int i=0; i< arrA.length; i++) {
            A += arrA[(arrA.length-1)-i];
        }
        for (int i=0; i< arrB.length; i++) {
            B += arrB[(arrB.length-1)-i];
        }
        if (Integer.parseInt(A) < Integer.parseInt(B)) {
            System.out.println(B);
        } else {
            System.out.println(A);
        }
    }
}
