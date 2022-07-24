package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1920
// 수의 합(이분 탐색)
public class BOJ_1920 {

    public static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < M; i++) {
            if(binarySearch(Integer.parseInt(st.nextToken())) < 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }

    }

    public static int binarySearch(int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;

            if(key < arr[mid]) {
                hi = mid - 1;
            } else if(key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
