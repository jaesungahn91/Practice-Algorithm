package baekjoon.class_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린 드롬수
public class BOJ_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) break;
//            char[] numCharArr = String.valueOf(num).toCharArray();
//            String result = "no";
//            if(numCharArr.length%2 == 1) {
//                int mid = (numCharArr.length/2)+1;
//                boolean chk = true;
//                for(int i = 1; i < mid; i++) {
//                    if (numCharArr[(mid-i)-1] != numCharArr[(mid +i)-1]) {
//                        chk = false;
//                        break;
//                    }
//                }
//                if(chk) result = "yes";
//            }
//            System.out.println(result);

            char[] numCharArr = String.valueOf(num).toCharArray();
            boolean chk = true;
            int start = 0;
            int end = numCharArr.length-1;
            while(start <= end) {
                if(numCharArr[start] != numCharArr[end]) {
                    chk = false;
                    break;
                }
                start++;
                end--;
            }
            if(chk) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
