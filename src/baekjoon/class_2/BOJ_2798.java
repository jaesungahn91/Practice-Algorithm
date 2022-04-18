package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 브루트 포스(brute force) 문제
public class BOJ_2798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] card = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(search(card, N, M));
    }

    public static int search(int[] card, int N, int M) {
        int sum = 0;

        for(int i = 0; i < N-2; i++) {
           for(int j = i+1; j < N-1; j++) {
               for(int k = j+1; k < N; k++) {
                   int add = card[i] + card[j] + card[k];

                   if(add == M) {
                       return add;
                   }

                   if((sum < add) && (add < M)) {
                        sum = add;
                   }
               }
           }
        }

        return sum;
    }

}
