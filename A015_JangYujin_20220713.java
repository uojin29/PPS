import java.util.Scanner;

public class A015_JangYujin_20220713 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int result = 0;

        for(int i = 0; i < 5; i++){
            num = sc.nextInt();
            sum += (num * num);
        }
        result = sum % 10;
        System.out.println(result);
    }
}
