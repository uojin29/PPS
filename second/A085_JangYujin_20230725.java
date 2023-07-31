package second;

import java.util.*;

public class A085_JangYujin_20230725 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] strArray = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            strArray[i] = s.substring(i, s.length());
        }

        Arrays.sort(strArray);

        for (String str : strArray) {
            System.out.println(str);
        }
    }
}
