package second;

import java.util.Scanner;

public class A111_JangYujin_20230725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        for (int i = 0; i < tc; i++) {
            int x = scanner.nextInt();
            double res = Math.pow(2.0, x) - 1;
            System.out.println((int) res);
        }

        scanner.close();
    }
}
