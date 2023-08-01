package third;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class A125_JangYujin_20230801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr, Collections.reverseOrder());
        int total = 0;

        for (int i = 0; i < n; i++) {
            total = Math.max(total, arr[i] * (i + 1));
        }
        System.out.print(total);
    }
}
