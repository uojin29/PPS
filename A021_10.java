import java.util.Scanner;

public class A021_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = -num + 1;

        for(int i = 0; i < num; i++){
            int plug = sc.nextInt();
            result += plug;
        }
        System.out.println(result);
    }
}