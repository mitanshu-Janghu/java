
import java.util.Scanner;

public class Monster_Game {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        int x = sc.nextInt();
        while (x > 0) {
            int y = sc.nextInt();
            System.out.println(solve(y, sc));
            x--;
        }
        
        sc.close();
    }

    static long solve(int n, Scanner sc) {
        int[] a = new int[n];
        int[] z = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            z[i] = sc.nextInt();
        }

         long ans = 0;
        int j = n - 1;

        while (j >= 0) {
            int[] b = z.clone(); 

            long diff = a[j];
            int x = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] >= diff) {
                    if (x < n) { 
                        b[x]--;
                        if (b[x] == 0) {
                            x++;
                        }
                    }
                }
            }

            ans = Math.max(x * diff, ans);
            j--;
        }

        return ans;
    }
}