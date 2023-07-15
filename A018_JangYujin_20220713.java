import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A018_JangYujin_20220713 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Integer[] B = new Integer[N];
        int result = 0;

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for(int i = 0; i < N; i++){
            B[i] = sc.nextInt();
        }
        Arrays.sort(B, Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            result += A[i] * B[i];
        }
        System.out.println(result);
    }
}
