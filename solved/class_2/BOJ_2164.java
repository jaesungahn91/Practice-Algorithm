package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 카드 2
public class BOJ_2164 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=1; i <= N; i++) {
            queue.add(i);
        }

        while(queue.size() != 1) {
            queue.remove();
            Integer temp = queue.peek();
            queue.poll();
            queue.add(temp);
        }

        System.out.println(queue.peek());

    }

}
