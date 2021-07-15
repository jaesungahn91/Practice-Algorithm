package baekjoon.class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 단어 공부
// https://www.acmicpc.net/problem/1157
public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split("");

        Map<String, Integer> map = new HashMap<>();

        for (String s : st) {
            map.put(s.toUpperCase(), map.getOrDefault(s.toUpperCase(), 0) + 1);
        }

        int max = 0;
        String maxKey = "";

        for (String key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                maxKey = key;
            } else if (max == map.get(key)) {
                maxKey = "?";
            }
        }
        System.out.println(maxKey);
    }
}
