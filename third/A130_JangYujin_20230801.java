package third;

import java.util.Scanner;
import java.util.Stack;

public class A130_JangYujin_20230801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(int i = 0; i < K; i++){
            int input = sc.nextInt();
            if(input != 0){
                stack.push(input);
            }
            else stack.pop();
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);
    }
}
