import java.util.Scanner;

public class A045_JangYujin_20230714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toUpperCase();
        int[] alphabet = new int[26];
        int maxCount = 0;
        char maxChar = ' ';
        boolean bool = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            alphabet[c - 'A']++;
            if (alphabet[c - 'A'] > maxCount) {
                maxCount = alphabet[c - 'A'];
                maxChar = c;
                bool = false;
            }
            else if(alphabet[c - 'A'] == maxCount){
                bool = true;
            }
        }
        if(bool == false){
            System.out.print(maxChar);
        }
        else System.out.print("?");
    }
}
