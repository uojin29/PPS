import java.util.Scanner;

public class A020_JangYujin_20220714 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();

            num = num - out + in;
            arr[i] = num;
        }
        int max = 0;
        for(int i = 0; i < 4; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
