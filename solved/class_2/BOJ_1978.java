package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 찾기
public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i]) && arr[i] != 1) {
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean isPrime(int num) {
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
