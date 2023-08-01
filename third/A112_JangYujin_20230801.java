package third;

import java.util.Arrays;
import java.util.Scanner;

public class A112_JangYujin_20230801 {
    static int[][] graph = new int[1001][1001];
    static int V;
    static int E;
    static boolean[] visited = new boolean[1001];

    public static void dfs(int index) {
        if(visited[index] != true){
            visited[index] = true;
            for(int i = 1; i <= V; i++) {
                if(graph[index][i] == 1) {
                    dfs(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        V = sc.nextInt();
        E = sc.nextInt();

        int a,b;
        for(int i = 0; i < E; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            graph[a][b] = graph[b][a] = 1;
        }

        int result = 0 ;

        for(int i = 1; i <= V; i++) {
            if(visited[i] == false) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
