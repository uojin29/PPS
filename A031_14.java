import java.util.Scanner;

public class A031_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;

        result = M * N - 1;
        System.out.println(result);
    }
}