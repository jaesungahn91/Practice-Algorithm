package baekjoon;

import java.util.Scanner;

public class BOJ_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int blockNum = 1;
        int result = 1;

        if (N != 1){
            result = 2;
            blockNum = 6;

            while (true) {
                if(blockNum >= N){
                    break;
                }
                blockNum *= 3;
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
