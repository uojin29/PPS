import java.util.Scanner;

public class A029_JangYujin_20230714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int door[] = new int[6];
        int num = sc.nextInt();
        door[0] = num;
        int temp = num;
        for(int i = 1; i < 5; i++) {
            door[i] = 1 - num;
            num = 1 - num;
        }
        if (N > 5) {
            System.out.println("Love is open door");
        }
        else {
            for(int i = 1; i < N; i++) {
                System.out.println(door[i]);
            }
        }
    }
    private static String src = "10\r\n" + "1";
}