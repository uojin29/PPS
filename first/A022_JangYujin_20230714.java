import java.util.Scanner;

public class A022_JangYujin_20230714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int M = 0;
        int Y = 0;

        for(int i = 0; i < num; i++){
            int time = sc.nextInt();
            Y += ((time / 30) + 1) * 10;
            M += ((time / 60) + 1) * 15;
        }
        if(M < Y){
            System.out.println("M " + M);
        }
        else if(M > Y){
            System.out.println("Y " + Y);
        }
        else if(M == Y) System.out.println("Y M " + M);
    }
}
