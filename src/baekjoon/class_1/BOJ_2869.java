package baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 달팽이는 올라가고 싶다
public class BOJ_2869 {
    public static void main(String[] args) throws IOException {
        // 높이 V
        // 낮 A 올라감. 밤 B 미끄러짐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int day = 1;

        day = ((V - B) / (A - B));

        if (((V - B) % (A - B)) != 0) day++;

        System.out.println(day);
    }
}
