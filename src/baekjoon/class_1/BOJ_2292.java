package baekjoon.class_1;

import java.util.Scanner;

public class BOJ_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int blockNum = 1;
        int cnt = 1;

        while (N != 1) {

            blockNum += ((cnt-1)*6);
            if (N <= blockNum) {
                break;
            }
            cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}
