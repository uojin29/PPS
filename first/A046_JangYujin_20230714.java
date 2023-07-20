import java.util.Scanner;

public class A046_JangYujin_20230714 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        int n = Integer.parseInt(sc.next());
        boolean possible = false;
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            char c = name.charAt(0);
            arr[c - 97]++;
            if (arr[c - 97] == 5) possible = true;
        }
        if (possible) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) System.out.print((char)(i+97));
            }
        } else {
            System.out.print("PREDAJA");
        }
    }
}