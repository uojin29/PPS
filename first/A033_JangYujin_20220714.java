import java.util.Scanner;

public class A033_JangYujin_20220714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[5][4];
        int max = 0;
        int max_p = 0;
        for(int i = 0; i < 5; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                score[i][j] = sc.nextInt();
                sum += score[i][j];
            }
            if(sum > max){
                max = sum;
                max_p = i + 1;
            }
        }
        System.out.println(max_p + " " + max);
    }
}
