import java.util.*;

public class fairy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }

            int D = set.size();
            while (!set.contains(D)) {
                set.add(D);
                D = set.size();
            }

            System.out.println(D);
        }
        sc.close();
    }

}