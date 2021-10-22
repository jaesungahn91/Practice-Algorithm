package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 랜선 자르기 (이분 탐색)
public class BOJ_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());   // 이미 가지고 있는 랜선의 개수
        int N = Integer.parseInt(st.nextToken());   // 필요 랜선의 개수
        // 최대 랜선의 길이

        int[] arr = new int[K];

        long max = 0;

        for(int i=0; i<K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;

        while(min < max) {
            mid = (max + min) / 2;

            long count = 0;

            for(int i=0; i< arr.length; i++) {
                count += (arr[i] / mid);
            }

            if(count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}
