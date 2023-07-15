import java.util.Scanner;

public class A008_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int s_num = 0;
        int[] score;
        for(int i = 0; i < num; i++){
            s_num = sc.nextInt();
            score = new int[s_num];
            float sum_score = 0;

            for(int j = 0; j < s_num; j++){
                int n = sc.nextInt();
                score[j] = n;
                sum_score += n;
            }

            float avg = (sum_score / s_num);
            float count = 0;

            for(int j = 0; j < s_num; j++){
                if(score[j] > avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/s_num)*100);
        }
    }
}
