package baekjoon.class_1;

import java.util.Scanner;

public class BOJ_1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int sum = 0;
        int maxNum = 1;
        int bunmo = 1;
        int bunja = 1;
        for (int i = 0; sum < X; i++) {

            sum += i;
            maxNum = i;
        }

        if(maxNum % 2 == 0){
            bunja = X - (sum - maxNum);
            bunmo = sum - X + 1;
        } else {
            bunmo = X - (sum - maxNum);
            bunja = sum - X + 1;
        }

        System.out.println(bunja+"/"+bunmo);
    }
}
