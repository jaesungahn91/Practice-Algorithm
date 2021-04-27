package baekjoon;

import java.util.Scanner;

public class BOJ_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        Long A = Long.parseLong(input[0]);
        Long B = Long.parseLong(input[1]);
        Long C = Long.parseLong(input[2]);

        int result = -1;
        int i = 1;
        while (B < C){
            if(A+(B*i) < C*i){
                result = i;
                break;
            }
            i++;
        }
        System.out.println(result);
    }
}
