package second;

import java.util.Scanner;

public class A109_JangYujin_20230725 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int belt = 0;
        int beltm = 1;

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int s = sc.nextInt();

            if (s == 1) {
                if (belt == 0)
                    belt = 1;
                else if (belt == 1)
                    belt = 0;
            }

            beltm = (beltm / a) * b;
        }

        System.out.println(belt + " " + beltm);
    }
}
