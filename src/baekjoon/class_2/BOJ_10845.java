package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int back = 0;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    back = num;
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.remove());
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(queue.size());
                    sb.append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.peek());
                    }
                    sb.append("\n");
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(back);
                    }
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

}
