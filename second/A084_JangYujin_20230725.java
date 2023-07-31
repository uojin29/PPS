package second;

import java.util.*;

public class A084_JangYujin_20230725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        ArrayList<Integer> arry = new ArrayList<>(set);
        Collections.sort(arry);

        StringBuilder sb = new StringBuilder();
        for (int i : arry) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}
