package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2609 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int min = Math.min(N, M);

        int divisor = 1;
        for(int i = min; i > 0; i--) {
            if(N % i == 0 && M % i == 0) {
                System.out.println(i);
                divisor = i;
                break;
            }
        }

        System.out.println((N*M)/divisor);

    }

}
