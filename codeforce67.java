import java.util.Scanner;

public class codeforce67 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int n = sc.nextInt();
            boolean found = false;

            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                if(num == 67){
                    found = true;
                }
            }

            if(found) System.out.println("YES");
            else System.out.println("NO");

            t--;
        }
        sc.close();
    }
}
