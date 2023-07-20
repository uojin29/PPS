import java.util.Scanner;

public class A019_JangYujin_20230714 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String result = Integer.toString(A * B * C);
        int[] arr = new int[10];

        for(int i = 0; i < result.length(); i++){
            int num = Character.getNumericValue(result.charAt(i));
            arr[num]++;
        }

        for(int i = 0; i < 10; i++){
            System.out.println(arr[i]);
        }
    }
}
