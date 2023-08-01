package third;

import java.util.Scanner;
import java.util.Stack;

public class A129_JangYujin_20230801 {
    public static void main(String[] args) {
        int[] dp = new int [11];
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int j = 4; j <= 10; j++) {
            dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
        }

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();

            System.out.println(dp[n]);
        }
    }
}
