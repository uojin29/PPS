import java.util.*;

public class A034_17_3052 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();

        for(int i = 0; i < 10; i++){
            h.add(s.nextInt() % 42);
        }
        System.out.println(h.size());
    }
}