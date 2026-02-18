import java.util.*;

public class codeforcesper {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] arr;
    static int n;

    static void dfs(int node, List<Integer> comp) {
        visited[node] = true;
        comp.add(node);
        for(int next : graph[node]) {
            if(!visited[next]) {
                dfs(next, comp);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            n = sc.nextInt();
            arr = new int[n+1];

            for(int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            graph = new ArrayList[n+1];
            for(int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            for(int i = 1; 2*i <= n; i++) {
                graph[i].add(2*i);
                graph[2*i].add(i);
            }

            visited = new boolean[n+1];

            int[] sorted = arr.clone();
            Arrays.sort(sorted);

            boolean ok = true;

            for(int i = 1; i <= n; i++) {
                if(!visited[i]) {
                    List<Integer> comp = new ArrayList<>();
                    dfs(i, comp);

                    List<Integer> values = new ArrayList<>();
                    List<Integer> target = new ArrayList<>();

                    for(int idx : comp) {
                        values.add(arr[idx]);
                        target.add(sorted[idx]);
                    }

                    Collections.sort(values);
                    Collections.sort(target);

                    if(!values.equals(target)) {
                        ok = false;
                        break;
                    }
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
