package third;

import java.util.Scanner;
import java.util.Stack;

public class A128_JangYujin_20230801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;

        while(true) {
            input = sc.nextLine();

            if(input.equals(".")) {	// 종료 조건문
                break;
            }
            System.out.println(solve(input));
        }

    }

    public static String solve(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[') {
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.empty() || stack.peek() != '(') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
            else if(c == ']') {
                if(stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
        }

        if(stack.empty()) {
            return "yes";
        }
        else {
            return "no";
        }
    }
}
