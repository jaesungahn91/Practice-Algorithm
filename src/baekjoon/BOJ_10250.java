package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ACM 호텔
public class BOJ_10250 {

    public static void main(String[] args) throws IOException {
        // 1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int X, Y;

            // 매층 첫번쨰 방을 우선으로한다.
            // 거리가 같을 경우 아래층 방을 선호.
            // 숙박하고있는 방은 제외 해야한다.
            // H W N 순으로 받는다.
            if (N % H == 0) {
                Y = H * 100;
                X = (N / H);
            } else {
                Y = (N % H) * 100;
                X = (N / H) + 1;
            }
            System.out.println(Y + X);
        }
    }
}
