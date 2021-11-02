package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1929
// 소수 구하기 (1과 자기 자신만을 약수로 가지는 수)
public class BOJ_1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i = M; i <= N; i++) {
            if(isPrime(i) && i != 1){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
